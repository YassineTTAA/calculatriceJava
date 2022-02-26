package calculatriceJava;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatriceCorrection {
	private JFrame frame = new JFrame();
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JTextField textField;
	private JButton btn1;
	private JButton btn2;
	private JButton btnPlus;
	private JButton btnEgale;
	private int result = 0;
	public static void main(String[] args){
		CalculatriceCorrection calc = new CalculatriceCorrection();
		calc.init();
//		initPanel1();
//		initPanel2();
//		initPanel3();

	}
	

	public void init() {
		Dimension d = new Dimension(400,600);
		panel1 = createPanel(50, Color.black);
		panel2 = createPanel(300, Color.red);
		panel3 = createPanel(50, Color.green);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension (350,40));
		panel1.add(textField);
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		panel2.add(btn1);
		panel2.add(btn2);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
				
			}
		} );
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
				
			}
		});
		
		btnPlus = new JButton("+");
		panel3.add(btnPlus);
		btnPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result = result + Integer.valueOf(textField.getText());
				textField.setText("");
	
			}
		});
		btnEgale = new JButton("=");
		panel3.add(btnEgale);
		btnEgale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result = result + Integer.valueOf(textField.getText());
				textField.setText(result + "");
				result = 0;

				
			}
		});
		
		
		BoxLayout frameLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.setLayout(frameLayout);
		frame.setSize(d);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
		frame.setVisible(true);
		
	}
	
	public JPanel createPanel(int height, Color color) {
		JPanel panel = new JPanel();
		panel.setBackground(color);
		panel.setPreferredSize(new Dimension(frame.getWidth(), height));
		return panel;
	}
	
	
	
	

}

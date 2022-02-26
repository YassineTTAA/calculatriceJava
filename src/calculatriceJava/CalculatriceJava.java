package calculatriceJava;
import javax.swing.*;
import java.awt.*;
public class CalculatriceJava{  	
  public static void main(String[] args){
	JButton btnEmpty1 = new JButton(" ");
	JButton btnEmpty2 = new JButton(" ");
	JButton btnEmpty3 = new JButton(" ");
	JButton btnEmpty4 = new JButton(" ");
	JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnOK = new JButton("OK");
	JButton btnC = new JButton("C");
	JButton btnPlus = new JButton("+");
	JButton btnFois = new JButton("X");
	JButton btnDiviser = new JButton("/");
	JButton btnSoustraire = new JButton("-");
// Le Jfram qui va tout contenir.	
    JFrame frame = new JFrame();
// Le panel affichage.    
    JPanel panelTop = new JPanel();    
// Le panel des boutons chiffre, le bouton C et les bouton vide pour combler les cases.   
    JPanel panelMid = new JPanel();   
// Le panel des boutons opérations.    
    JPanel panelBot = new JPanel();
// On met chaque bouton dans le panel associé
    // Top
    // Mid  
//    panelMid.add(btnEmpty1);
//    panelMid.add(btnEmpty2);
//    panelMid.add(btnC);
//    panelMid.add(btn0); 
//    panelMid.add(btn1);
//    panelMid.add(btn2); 
//    panelMid.add(btn3);
//    panelMid.add(btn4); 
//    panelMid.add(btn5);
//    panelMid.add(btn6); 
//    panelMid.add(btn7);
//    panelMid.add(btn8); 
//    panelMid.add(btnEmpty3);
//    panelMid.add(btn0);
//    panelMid.add(btnEmpty4);   
    // Bot  
//    frame.add(btnPlus);
//    frame.add(btnFois);
//    frame.add(btnDiviser);
//    frame.add(btnSoustraire);
    panelMid.setBackground(Color.RED);
    panelMid.setLayout(new GridLayout(3,3));
    panelMid.setBounds(40,200,320,150);
    frame.add(panelMid);
    frame.setTitle("Calculatrice Java");
    frame.setSize(400,600);
    frame.setLocation(500,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
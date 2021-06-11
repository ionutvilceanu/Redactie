

import java.awt.event.ActionListener;



import javax.swing.JFrame;
import javax.swing.JPanel;



import javax.swing.JButton;
//import java.awt.BorderLayout;
import java.awt.Color;

public class Interfata {

public static void main(String[] args) {
		
		JFrame frame = new JFrame("Baza de date");
		  frame.setVisible(true);
		  frame.setSize(800,300);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  
		  JPanel panel = new JPanel();
		  panel.setBackground(Color.CYAN);
		  frame.getContentPane().add(panel);
		  JButton button = new JButton("Select Ziarist");
		  panel.add(button);
		  button.addActionListener ((ActionListener) new ConnectionMySQL());
		  button.setBackground(Color.red);
		  
		  JButton button2 = new JButton("Inserare in Baza de Date");
		  panel.add(button2);
		  button2.addActionListener ((ActionListener) new InsertZiarist());
		  button2.setBackground(Color.red);
		  
		  JButton button3 = new JButton("Interogari");
		  panel.add(button3);
		  button3.addActionListener ((ActionListener) new ZiaristUpdate());
		  button3.setBackground(Color.red);
		  
		  JButton btnRedactiegroupby = new JButton("RedactieGroupBy");
		  panel.add(btnRedactiegroupby);


	}
}
	
		
		
		



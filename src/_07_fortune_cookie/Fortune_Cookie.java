package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
	
			   
			  
	public void showButton() {
	     JFrame frame = new JFrame();
	     frame.setVisible(true);
	     JButton button = new JButton();
	     frame.add(button);
	     frame.pack();
	     
	     //popup code
	     button.addActionListener(this);
	     
	   }
	
		      
		      
	public static void main(String[] args) {
				
		    	
		    	
		    	
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stuff
		int rand = new Random().nextInt(5);
		String fortune;
		if (rand == 0) {
			fortune = "You will recieve V-Bucks in the next 24 hours";
		}
		if (rand == 1) {
			fortune = "You will die in Minecraft tomorrow.";
		}
		if (rand == 2) {
			fortune = "You will fail in school this year!";
		}
		if (rand == 3) {
			fortune = "You will pass all of your classes this year!";
		}
		if (rand == 4) {
			fortune = "You will win a million dollars!";
		}
		
		JOptionPane.showMessageDialog(null, fortune);
		
	}		   
}

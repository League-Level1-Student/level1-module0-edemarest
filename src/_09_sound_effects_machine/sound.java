package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound implements ActionListener {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Laugh");
		JButton button2 = new JButton("Wolf");
		JButton button3 = new JButton("Truck");
		JButton button4 = new JButton("Seagull");
	public void showStuff() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button1)) {
			playSound("laugh.wav");
		}
		if (e.getSource().equals(button2)) {
			playSound("wolf.wav");
		}
		if (e.getSource().equals(button3)) {
			playSound("truck.wav");
		}
		if (e.getSource().equals(button4)) {
			playSound("seagull.wav");
		}
	}
	
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	    sound.play();
	}
}

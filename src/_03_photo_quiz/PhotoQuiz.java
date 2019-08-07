package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		//JPanel panel = new JPanel();
		//quizWindow.add(panel);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
			//
		// 2. create a variable of type "Component" that will hold your image
			//Component comp;
		// 3. use the "createImage()" method below to initialize your Component
			//comp = createImage(image);
		// 4. add the image to the quiz window
			//quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
			
		// 6. ask a question that relates to the image
			
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

			String imagetwo = "https://i.ytimg.com/vi/P_SeZhpqbvE/maxresdefault.jpg";
			Component comptwo;
			comptwo = createImage(imagetwo);
			quizWindow.add(comptwo);
			quizWindow.pack();
			
			String image = "https://images.unsplash.com/photo-1503803548695-c2a7b4a5b875?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80";
			Component comp;
			comp = createImage(image);
			quizWindow.add(comp);
			quizWindow.pack();
			
			String answerone = JOptionPane.showInputDialog("Is this the morning or the afternoon?");
			
			if (answerone.equals("afternoon")) {
				System.out.println("CORRECT");
			}
			else {
				System.out.println("INCORRECT");
			}
			// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

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

	// 1. find an image on the internet

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// This will make st, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String file = "QuestoinMark.png";
		// 2. create a variable of type "Component" that will hold your image

		JLabel image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createLabelImage(file);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. cal93l the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog(quizWindow,"Is this picture used in some sentences?");
		// 7. print "CORRECT" if the user gave the right answer
//the quiz window (you may not see the
		// effect of this until step 12)
if(answer.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(quizWindow, "Correct");	
}else {
	JOptionPane.showMessageDialog(quizWindow, "Incorrect");
}
		// 10. find another image and create it (might take more than one line
		// of code)
String file2 = "ExclamationMark.png";
// 2. create a variable of type "Component" that will hold your image
quizWindow.remove(image);
// 3. use the "createImage()" method below to initialize your Component
image = createLabelImage(file2);
// 4. add the image to the quiz window
quizWindow.add(image);
// 5. cal93l the pack() method on the quiz window
quizWindow.pack();

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
String answer2 = JOptionPane.showInputDialog(quizWindow,"Is this picture used in some sentences?");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer2.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(quizWindow, "Correct");	
}else {
	JOptionPane.showMessageDialog(quizWindow, "Incorrect");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from
		return imageLabel;
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

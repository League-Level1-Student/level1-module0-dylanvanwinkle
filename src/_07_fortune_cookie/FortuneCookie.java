package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    JFrame frame = new JFrame();
	public void showButton() {
        System.out.println("Button clicked");
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(frame, "Wooohooo");
		int rand = new Random().nextInt(5);
	switch(rand) {
	case 0:JOptionPane.showMessageDialog(frame, "There is a chance you will get a million dollars.");
	break;
	case 1:JOptionPane.showMessageDialog(frame, "There I a chance you will be Happy.");
	break;
	case 2:JOptionPane.showMessageDialog(frame, "There I a chance you will be Mad.");
	break;
	case 3:JOptionPane.showMessageDialog(frame, "There I a chance you will be Sad.");
	break;
	case 4:JOptionPane.showMessageDialog(frame, "There I a chance you will be exicted.");
	break;
	}
	}
}

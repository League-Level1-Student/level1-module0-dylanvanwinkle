package _09_sound_effects_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	Dimension size = new Dimension(100, 100);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Drum");
	JButton button2 = new JButton("Gutar");
	JButton button3 = new JButton("Piano");
	JButton button4 = new JButton("Flute");
	public void showButton() {
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setPreferredSize(size);
		button2.setPreferredSize(size);
		button3.setPreferredSize(size);
		button4.setPreferredSize(size);
		frame.add(panel);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getSource() == button1) {
	System.out.println("Drum");
}
if(e.getSource() == button2) {
	System.out.println("Gutar");
}
if(e.getSource() == button3) {
	System.out.println("Piano");
}
if(e.getSource() == button4) {
	System.out.println("Flute");
}
	}
}
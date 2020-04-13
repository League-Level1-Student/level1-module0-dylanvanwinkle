package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot r = new Robot("batman");
	Random ran = new Random();

	public void run() {
		r.setX(880);
		r.setY(500);
		r.penDown();
		r.setSpeed(8);
		String color = JOptionPane.showInputDialog("what color do you wan to draw the houses.(red, green, blue)");
		Color c = Color.black;;
		if (color.equalsIgnoreCase("red")) {
			c = Color.red;
		} else if (color.equalsIgnoreCase("green")) {
			c = Color.green;
		} else if (color.equalsIgnoreCase("blue")) {
			c = Color.blue;
		}else {
			JOptionPane.showMessageDialog(null, "Thats not a valid color.");
		}
		for (int i = 10; i < 19; i++) {
			int rn = ran.nextInt(3);
			if (rn == 0) {
				drawHouse("small", c);
			} else if (rn == 1) {
				drawHouse("medium", c);
			} else {
				drawHouse("large", c);
			}
		}
	}

	public void drawHouse(int number, Color color) {
		r.setPenColor(color);
		r.setAngle(0);
		r.move(number);
		r.turn(-90);
		r.move(40);
		r.turn(-90);
		r.move(number);
		r.turn(90);
		r.setPenColor(0, 124, 0);
		r.move(40);
	}

	public void drawHouse(String size, Color color) {
		if (size.equalsIgnoreCase("small")) {
			drawHouse(60, color);
		} else if (size.equalsIgnoreCase("medium")) {
			drawHouse(120, color);
		} else if (size.equalsIgnoreCase("large")) {
			drawHouse(250, color);
		} else {
			JOptionPane.showMessageDialog(null, "Thats not a valid size");
		}
	}
}

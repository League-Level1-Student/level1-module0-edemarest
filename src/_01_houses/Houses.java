package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		rob.moveTo(20,400);

		draw("small", "red");
		draw("large", "orange");
		draw("medium", "yellow");
		draw("large", "green");
		
		
		
		
		
	}


	
	static void draw(String height, String color) {
		
		
		
		int distance = 0;
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenWidth(15);
		
		//colors
		if (color.equals("red")) {
			rob.setPenColor(209, 0, 0);
		}
		if (color.equals("orange")) {
			rob.setPenColor(255, 166, 0);
		}
		if (color.equals("yellow")) {
			rob.setPenColor(255, 247, 0);
		}
		if (color.equals("green")) {
			rob.setPenColor(46, 230, 0);
		}
		if (color.equals("blue")) {
			rob.setPenColor(0, 164, 219);
		}
		if (color.equals("purple")) {
			rob.setPenColor(114, 0, 214);
		}
		
		//heights
		if (height.equals("small")) {
			distance = 60;
		}
		else if (height.equals("medium")) {
			distance = 120;
		}
		else {
			distance = 250;
		}

		rob.move(distance);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(distance);
		rob.turn(-90);
		rob.setPenColor(0, 181, 6);
		rob.move(100);
		rob.turn(-90);
	}
	
}

package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot ringOne = new Robot(100,400);
		Robot ringTwo= new Robot(350,600);
		Robot ringThree = new Robot(600,400);
		Robot ringFour = new Robot(850,600);
		Robot ringFive = new Robot(1100,400);
		
		ringOne.setSpeed(10);
		ringOne.setPenColor(Color.BLUE);
		ringTwo.setSpeed(10);
		ringTwo.setPenColor(Color.YELLOW);
		ringThree.setSpeed(10);
		ringThree.setPenColor(Color.BLACK);
		ringFour.setSpeed(10);
		ringFour.setPenColor(Color.GREEN);
		ringFive.setSpeed(10);
		ringFive.setPenColor(Color.RED);
		
		
		Thread r1 = new Thread(()->drawCircle(ringOne));
		Thread r2 = new Thread(()->drawCircle(ringTwo));
		Thread r3 = new Thread(()->drawCircle(ringThree));
		Thread r4 = new Thread(()->drawCircle(ringFour));
		Thread r5 = new Thread(()->drawCircle(ringFive));
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
		
	}
	public static void drawCircle(Robot rob) {
		rob.setPenWidth(5);
		rob.penDown();
		int angle = 0;
		for (int i = 0; i < 360; i++) {
			int update = angle +1;
			rob.setAngle(update);
			rob.move(3);
			angle = update;
		}
		rob.penUp();
		rob.hide();
	}
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
}


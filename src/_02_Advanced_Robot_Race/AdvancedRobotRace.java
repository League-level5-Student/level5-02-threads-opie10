package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static boolean race = true;
    // 1. make a main method
public static void main(String[] args) {
Robot[]robots = new Robot[10];

for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot((i*100)+100,700);
	robots[i].setPenColor(Color.BLACK);
	robots[i].setSpeed(10);
}
Thread t1 = new Thread(()->race(robots[0]));
Thread t2 = new Thread(()->race(robots[1]));
Thread t3 = new Thread(()->race(robots[2]));
Thread t4 = new Thread(()->race(robots[3]));
Thread t5 = new Thread(()->race(robots[4]));
Thread t6 = new Thread(()->race(robots[5]));
Thread t7 = new Thread(()->race(robots[6]));
Thread t8 = new Thread(()->race(robots[7]));
Thread t9 = new Thread(()->race(robots[8]));
Thread t10 = new Thread(()->race(robots[9]));
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
t6.start();
t7.start();
t8.start();
t9.start();
t10.start();


        
}
public static void race(Robot rob) {
while(rob.getY()>50) {
		int dist = new Random().nextInt(50);
		rob.move(dist);
	}



}
}

package com.yedma.classes.statics;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setSpeed(-10); // c1.speed = -10; speed에 private를 걸어서 직접못씀
		c1.getSpeed();
		System.out.println("속도: " + c1.getSpeed());
		c1.setSpeed(60);
		if(!c1.isStop()) {
			c1.setStop(true); //stop : true, speed:0
		}
		
		System.out.println("현재속도:" + c1.getSpeed());
	}


}

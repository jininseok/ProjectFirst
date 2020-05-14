package com.yedma.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire ("뒤 왼쪽", 16);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("뒤왼쪽",17);
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("뒤 오른쪽",18);
				break;
			}
			System.out.println("===================================");
		}
	}
}

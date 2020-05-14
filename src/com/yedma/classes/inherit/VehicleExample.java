package com.yedma.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		//Vehicle타입을 소문자에다가 담는다. 타입이 맞을경우만 가능
		vehicle.run();
		
		vehicle = new Bus();// 버스클래스는 자식클래스, 부모 클래스 변수 = (자동형변환) 자식클래스 인스턴스 할당 가능
		vehicle.run();
		
		vehicle = new Taxi(); // 동일
		vehicle.run(); // 어떤 인스턴스가 담겨있는지에 따라 결과값이달라짐.
		
		// 자식클래스 = (강제형변환) 부모클래스;
		Taxi taxi = (Taxi) vehicle;
		taxi.run();
	}
}

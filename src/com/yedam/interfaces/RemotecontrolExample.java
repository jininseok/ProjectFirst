package com.yedam.interfaces;

public class RemotecontrolExample {
	public static void main(String[] args) {
		RemoteControl rc =new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}
}

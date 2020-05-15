package com.yedam.interfaces;

public interface RemoteControl {
	// 상수필드 Final static(포함)
	// static : 클래스이름에 
	public int MAX_VOLUME = 0;
	public int MIN_VOLUME = 10;
	
	//추상 메소드: 선언없이
	public void turnOn();
	public void turnOff();
	

}

package com.yedma.classes.statics;

public class Car {
	//private = 접근수준
	private int speed;  // 초기값 : 0
	private boolean stop; // 초기값: True
//	Car(int speed) {
//		this.speed = speed;
//	}
	void setSpeed(int speed) {
		if(speed < 0)
			this.speed =0;
		else
			this.speed = speed;
	}
	//오른쪽클릭 - source - generate getter 하면 편하게 get메소드 설정가능

	int getSpeed( ) {
		return this.speed;
		
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop (boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
}

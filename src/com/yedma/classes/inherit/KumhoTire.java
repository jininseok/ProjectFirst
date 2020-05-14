package com.yedma.classes.inherit;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation; // 회전마다 누적
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Kumho Tire 수명" + 
		(maxRotation + accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " Kumho Tire 펑크 ***");
			return false;
		}
	}
}

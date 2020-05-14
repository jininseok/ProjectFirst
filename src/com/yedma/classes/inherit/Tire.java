package com.yedma.classes.inherit;

public class Tire {
	public int maxRotation; // 최대치만큼 회전하고 수명을 다함.(타이어의 수명)
	public int accumulatedRotation; // 현재 사용된 회전수
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation; // 회전마다 누적
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명" + 
		(maxRotation + accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
			
		}
	}
}

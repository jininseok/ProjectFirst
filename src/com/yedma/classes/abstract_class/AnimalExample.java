package com.yedma.classes.abstract_class;

public class AnimalExample {

	public static void main(String[] args) {
//		Animal animal = new Animal(); // 추상클래스라 인스턴스 생성이 불가하다.
	Animal ani = new Bird("조류");
	ani.breathe();
	ani.sound();
	
	cat ct = new cat("포유류");
	ct.breathe();
	ct.sound();
	
	ani = ct; //상속받은게 있어서 부모클래스에 자식클래스를 할당할 수 있음./ 상속관계에서 자동형변환
	}

}

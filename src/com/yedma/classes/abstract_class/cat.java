package com.yedma.classes.abstract_class;

public class cat extends Animal{
	public cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
//	public abstract void eat(); //추상메소드는 추상클래스에서만 가능하다. 
}

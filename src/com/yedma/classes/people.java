package com.yedma.classes;

public class people {
		
		//속성 3가지
		String name;
		String gender;
		int age;
		
		//기능 2가지
		
		void eat(String str) {
			System.out.println("주식은 "+ str + "입니다.");
		}
		
		void study(String str) {
			System.out.println("주로 " + str + "를 공부합니다.");
		}
		void showInfo() {
			System.out.println("name: "+ name + "gender: " + gender + "age: " + age);
	}
}


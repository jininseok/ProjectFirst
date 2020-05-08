package com.yedma.classes;

public class student {
	//(속성) => 필드
	String name; //이름
	int age;//나이
	double height;//키
	double weight;//몸무게
	
	//생성자 -> 필드의 초기값 지정
			student() {
				System.out.println("생성자 호출.");
			}
			
			student(String name) {
				this.name = name;
			}
	
	//(기능) = method(괄호존재, 반환타입존재{void,String},기능에 대한 정의,출력메소드)
	void study() {
		System.out.println("공부한다."); //공부한다
	};
	void exercise() {
		System.out.println("운동한다.");//운동한다
	}
	void eat(String str) {
		System.out.println(str + "을 먹는다.");//먹는다
	}
	
}

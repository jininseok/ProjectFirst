package com.yedma.classes;

public class StudentExample {

	public static void main(String[] args) {

		student stu = new student(); // 인스턴스 만들기(new)
		stu.name = "Hong"; // ""문자열선언
		stu.age = 20; // 숫자타입
		stu.height = 178.4; // 더블타입가능
		stu.weight = 75.5;
		stu.study();
		stu.eat("banana");

		System.out.println("이름은:" + stu.name + ", " + "나이는: " + stu.age);

		student stu1 = new student();
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 180.1;
		stu1.weight = 81.5;
		stu.exercise();
		stu1.eat("apple");

		System.out.println("이름은:" + stu1.name + ", " + "나이는: " + stu1.age);

		student stu2 = new student();
		stu2.name = "Choi";
		stu2.age = 31;
		stu2.height = 181.1;
		stu2.weight = 82.5;
		stu.exercise();
		stu1.eat("watermelon");

		System.out.println("이름은:" + stu2.name + ", " + "나이는: " + stu2.age);

		int[] intary = new int[5];
		intary[0] = 10;

		student[] s1 = new student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = "Choi";



		// Hong,Park,Choi 중 같은거만 출력할수 있도록 하게 만들기.

		for (student stud : s1) {
			System.out.println(stud.name + "/" + stud.age);
			if (inputStr.equals(stud.name)) { // equals 는 비교하는거 때문에 앞이랑 뒤를 다른거를 넣어야함
				System.out.println("이름이" +  "같습니다.");
			} else {
				System.out.println("이름이" + "다릅니다.");
			}
		}
	}
}

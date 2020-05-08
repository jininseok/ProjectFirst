package com.yedma.classes;

public class peopleExample {
	public static void main(String[] args) {

	people peo = new people();
	peo.name = "Jin";
	peo.gender = "Male";
	peo.age = 25;
	
	System.out.println("이름은: " + peo.name + "성별은: " +peo.gender + "나이는: " + peo.age);
	
	peo.study("컴퓨터");
	peo.eat("밥");
	
	people peo1 = new people();
	peo1.name = "Kim";
	peo1.gender = "female";
	peo1.age = 30;
	peo1.study("요리");
	peo1.eat("파스타");
	
	System.out.println("이름은: " + peo1.name + "성별은: " +peo1.gender + "나이는: " + peo1.age);

	
	people peo2 = new people();
	peo2.name = "Jo";
	peo2.gender = "female";
	peo2.age = 25;
	peo2.study("무역");
	peo2.eat("찌개");
	
	System.out.println("이름은: " + peo2.name + "성별은: " + peo2.gender + "나이는: " + peo2.age);

	people[] pary = new people[3];
	pary[0] = peo;
	pary[1] = peo1;
	pary[2] = peo2;
	
	for(people peod : pary) {
		System.out.println(peod.name + "/" + peod.gender + "/" + peod.age);
	}
	
	}
}

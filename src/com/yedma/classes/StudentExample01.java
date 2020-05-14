package com.yedma.classes;

public class StudentExample01 {

	public static void main(String[] args) {
		Student01 s1 = new Student01();
		s1.name = "Hong";
		s1.age = 20;
		s1.major = "English";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.major);
		
		Student01 s2 = new Student01("Park");
		s2.name = "Park";
		s2.age = 22;
		s2.major = "History";
		
		Student01 s3 = new Student01("Choi",25);
		s3.name = "Choi";
		s3.age = 25;
		s3.major = "Math";
		
		Student01[] students = new Student01 [5];
		students[0] = s1;
		students[1] = new Student01();
		students[2] = s2;
		students[3] = s3;
		

		for(Student01 s: students) {
			System.out.println(s.name);
		}
			

	}

}

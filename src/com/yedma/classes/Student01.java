package com.yedma.classes;

public class Student01 {

		//필드
		String name;
		int age;
		String major;
		//생성자
		public Student01() {
			//디폴트 생성자
			//매개값이 많을경우 디폴트 생성자가없으면 에러가남
		}
		//생성자 오버로딩
		public Student01(String name) {
			this.name = name;
			
		}
		//
		public Student01(String name, int age) {
			this.name =name;
			this.age = age;
			this.major = major;
		}
		//메소드
		void setMajor(String major) {
			this.major = major;
		
	}
		String getMajor() {
			return major;

}

}
package com.yedma.classes.expections;

public class NullpointerExceptions {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.toString());
		
		try {
//System.out.println(str.toString());
		//Class.forName("java.lang.String2");
	}	catch (NullPointerException e) {
		e.printStackTrace();
//		System.out.println("실행중 오류 발생");
//	} 	catch (ClassNotFoundException e) {
//		System.out.println("존재하지 않는 클래스입니다");
	} //try

	System.out.println("프로그램 종료");

	} //main
} //class

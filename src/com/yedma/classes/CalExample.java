package com.yedma.classes;

public class CalExample {

	public static void main(String[] args) {
		//인스턴스 생성
		Calculator cal =new Calculator();
		//반환타입이 없어서 담을수가 없음(void)
		cal.powerOn();
		int result1 = cal.sum(10,50);
		double result2 = cal.sum(10.5,50.3);
		cal.println("30");
		//println의 메소드는 매개변수를 다르게 호출 / 실행하도록
		//str타입만 정의되어있는데 int값을 출력하고싶다면 오버로딩을 써야함.
		cal.println(result1);
		cal.println(result2);
		
		double area1 =cal.getAreaRectangle(4.6, 5.5);
		cal.println("직사각형의 넓이의 : " + area1);
		//정사각형의 경우에는 한번만씀
		double area2 =cal.getAreaRectangle(5.5);
		cal.println(area2);
		
		cal.getAreaRectangle (area1,area2);


	}

}

package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		//*상속의 목적
		// 부모의 코드 자식이 사용 
		// -->코드를 안짜도된다
		// >>>>코드가 수정될때 테스트 조금해도된다
		
		//사각형
		Rectangle r01 = new Rectangle(3, 5, "빨강", "노랑");
		System.out.println(r01.toString());
		
		//원
		Circle c01 = new Circle(10, "파랑", "노랑");
		System.out.println(c01.toString());
		
		//삼각형
		Triangle t01 = new Triangle(13,15, "보라", "주황");
		System.out.println(t01.toString());
		
	}

}

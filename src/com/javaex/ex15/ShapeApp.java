package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		//사각형
		Rectangle r01 = new Rectangle();
		r01.setFillColor("노랑");
		r01.setLineColor("파랑");
		r01.setWidth(3);
		r01.setHeight(5);
		
		
		Rectangle r02 = new Rectangle(3, 5, "빨강", "노랑");
	}

}

package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point();
		Point p02 = new Point();

		p01.setX(2);
		p01.setY(3);

		p02.setX(100);
		p02.setY(200);

		p01.draw();
		p02.draw();

	}

}

package com.javaex.ex15;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

}

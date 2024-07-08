package com.javaex.ex15;

public class Triangle extends Shape{

	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(int width, int height, String fillColor, String lineColor) {
		
		//부모필드가 private 일때
		/*
		super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.width = width;
		this.height = height;
		*/
		/*
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		*/
		//부모의 필드가 protected 일때
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

}

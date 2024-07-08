package com.javaex.ex15;

public class Rectangle extends Shape {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
		
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
		
	}
	
	//
	
	
	
}

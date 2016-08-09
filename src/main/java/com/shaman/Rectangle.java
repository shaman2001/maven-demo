package com.shaman;

public class Rectangle extends Shape {
	private double SideA;
	private double SideB;

	public Rectangle(double sidea, double sideb) {
		this.SideA = sidea;
		this.SideB = sideb;
	}

	public double Area() {
		return SideA * SideB;
	}
}

package com.shaman;

public class Circle extends Shape {
	private static final double PI = Math.PI;
	private double Diameter;

	public Circle(double diameter) {
		this.Diameter = diameter;
	}

	public double Area() {
		double Radius = Diameter / 2;
		return PI * Math.pow(Radius, 2);
	}

}

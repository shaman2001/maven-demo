package com.shaman;

public class Point {
	int x;
	int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void PrintPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

	Point Center(Point other) {
		// Возвращает центр между этой и другой точками
		// Заметьте, мы используем целое число, поэтому не получим точное
		// значение
		return new Point((x + other.x) / 2, (y + other.y) / 2);
	}

	Point Scale(int ScaleFactor) {
		return new Point(Math.round(x / ScaleFactor), Math.round(y / ScaleFactor));
	}
}

package com.shaman;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Привет, детка");
		Calculator calc = new Calculator();
		System.out.println("2+5=" + calc.sum(2, 5));
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		Shape s1 = new Circle(5.0);
		Shape s2 = new Rectangle(5.0, 2.0);
		Shape larger = GetLargerShape(s1, s2);
		System.out.println("Площадь наибольшей фигуры " + Math.round(larger.Area()) + "см2");
    }
    public static Shape GetLargerShape(Shape s11, Shape s22) {
		if (s11.Area() > s22.Area())
			return s11;
		else
			return s22;
	}
}

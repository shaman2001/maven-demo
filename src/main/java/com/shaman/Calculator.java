package com.shaman;

public class Calculator {
	public int sum(int a, int b) {
		Adder adder = new Adder(a);
		// adder.add(b);
		for (int i = 0; i <= b; i++) {
			if (i == b) {
				adder.add(i);
			}
		}
		return adder.getSum();
	}
}

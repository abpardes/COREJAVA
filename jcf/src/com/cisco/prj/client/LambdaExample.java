package com.cisco.prj.client;

@FunctionalInterface
interface Computation {
	int compute(int x, int y);
}

public class LambdaExample {

	public static void main(String[] args) {
		Computation add = new Computation() {
			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};
		
		System.out.println(add.compute(5, 4));
		
		Computation subtract = (int x, int y) -> {
			return x - y;
		};
		
		System.out.println(subtract.compute(5, 4));
		
		Computation multiply = (x,y) -> x * y;
		
		System.out.println(multiply.compute(5, 4));
	}

}

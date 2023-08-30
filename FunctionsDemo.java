package java8.practice.com;

import java.util.function.Function;

public class FunctionsDemo {
	
	public static void main(String[] args) {
		
		
		Function<Integer, Integer> result = s -> s*s;
		System.out.println("square of 5 is " + result.apply(5));
	}

}

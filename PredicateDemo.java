package java8.practice.com;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("length is : " + checkLength.test("code"));
		
	}

}

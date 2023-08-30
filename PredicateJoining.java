package java8.practice.com;

import java.util.function.Predicate;

public class PredicateJoining {
	
	public static void main(String[] args) {
		
		
		Predicate<String> checkLen = s -> s.length()>=5;
		System.out.println("length is " + checkLen.test("coding java8"));
		
		Predicate<String> checkEven = s -> s.length()%2 ==0;
		System.out.println("length is " + checkEven.test("coding java8"));
		
		System.out.println("meging with and" + checkLen.or(checkEven).test("coding java8"));
		
		System.out.println("meging with and" + checkLen.negate().test("coding in java8"));
		
		
		
	}

}

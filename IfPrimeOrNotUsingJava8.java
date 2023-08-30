package java8.practice.com;

import java.util.stream.IntStream;

public class IfPrimeOrNotUsingJava8 {
	
	public static void main(String[] args) {
		
		
		System.out.println(isPrime(6));
	}
	
	public static boolean isPrime(int x) {
		
		// range is for loop starts from 2 
		return x>1 && IntStream.range(2, x).noneMatch(number -> x%number ==0);
	}

}

package java8.practice.com;

import java.util.function.Consumer;

public class ConsumerDemo {

	
	public static void main(String[] args) {
		
		
		Consumer<Integer> square = s -> System.out.println("Square is " + s*s);
		square.accept(5);
		
	}
}

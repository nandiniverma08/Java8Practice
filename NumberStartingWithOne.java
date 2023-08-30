package java8.practice.com;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream().map(s -> s+"").filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
	}

}

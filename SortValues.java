package java8.practice.com;

import java.util.Arrays;
import java.util.List;

public class SortValues {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		myList.stream().sorted().forEach(System.out::println);
		
	}

}

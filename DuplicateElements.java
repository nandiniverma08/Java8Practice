package java8.practice.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 Set<Integer> set = new HashSet<>();
		 myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		 
		 // basically what this set is doing it has .add method where it adds only distinct 
		 // elements which are not duplicate leaving behind duplicate elements.
		 // So that condition return true if distinct elemts and false if repeated.
		 // so as soon return false ! sign invert the consition of set and adding elements
		 // leaving behind duplicate elements adding to filter.
		 
	}

}

package java8.practice.com;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		long maxi = myList.stream().max(Integer::compare).get();
		System.out.println(maxi);
		
		// compare is static method in Integer class where it takes two integer
		// and analyse to give whether
		// x<y -> -1
		// x==y -> 0
		// x>y -> 1
		
	}

}

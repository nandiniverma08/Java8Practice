package java8.practice.com;

import java.util.Arrays;

public class SecondSmallest {
	
	
	public static void secondSmallest(int []nums) {
		
		int secondSmallest = Arrays.stream(nums).sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("array dosent exist"));
		System.out.println(secondSmallest);
		
	}
	
	public static void main(String[] args) {
		
		int []nums = {5,6,7,1,9,4};
		
		secondSmallest(nums);
	}

}

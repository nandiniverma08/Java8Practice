package java8.practice.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fetchCommonElements {
	
public static void fetchCommonElements(int []nums, int []nums2) {
	
	List<Integer> commonElements = Arrays.stream(nums).filter(number1 -> Arrays.stream(nums2)
			.anyMatch(number2 -> number2 == number1)).boxed().collect(Collectors.toList());
	
	System.out.println(commonElements);
		
		
	}
	
	public static void main(String[] args) {
		

		int []nums = {5,6,7,1,9,4};
		int []nums2 = {5,6,8,9,0,3};
		
		fetchCommonElements(nums, nums2);
	}

}

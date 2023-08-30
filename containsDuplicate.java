package java8.practice.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class containsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
	    List<Integer> list = Arrays.stream(nums)
	                               .boxed()
	                               .collect(Collectors.toList());
	    Set<Integer> set = new HashSet<>(list);
	     if(set.size() == list.size()) {
	       return false;
	   } 
	      return true;
	  }
	public static void main(String[] args) {
		
		int []nums = {1,2,3,4};
		
		System.out.println(containsDuplicate(nums)); 
//		 System.out.println("123");
		
	}
}

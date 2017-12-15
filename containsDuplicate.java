package leetcode;

import java.util.Arrays;

class Solution {
	public boolean containsDuplicate(int[] nums) {
		 //time limit
//		 Integer[] anum = new Integer[nums.length];
//		 for(int i=0;i<nums.length;i++){
//			 anum[i] = nums[i];
//		 }
//		 List<Integer> a = Arrays.asList(anum);
//		 for(int i=0;i<nums.length;i++){
//			 if(a.indexOf(nums[i])!=a.lastIndexOf(nums[i]))
//				 return true;
//		 }
//		 return false;
		 
		 Arrays.sort(nums);
		 for(int i=0;i<nums.length-1;i++){
			 if(nums[i] == nums[i+1])
				 return true;
		 }
		 return false;
	 }
}

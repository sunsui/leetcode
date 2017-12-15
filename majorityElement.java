package leetcode;

import java.util.Arrays;

class Solution {
	public int majorityElement(int[] nums) {
		 Arrays.sort(nums);
		 for(int i=0;i<nums.length;i++){
			 if(nums[i] == nums[i+nums.length/2])
				 return nums[i];
		 }
		 return 0;
	 }
}

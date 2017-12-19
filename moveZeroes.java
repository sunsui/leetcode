package leetcode;

import java.util.Arrays;

class Solution {
	public void moveZeroes(int[] nums) {
		 int count = 0;
		 for (int i = 0; i < nums.length - count; i++) {
			 if(nums[i]==0){
				 count ++;
				 for(int j=i; j<nums.length- count ;j++){
					 nums[j] = nums[j+1];
				 }
				 nums[nums.length - count  ] = 0;
				 
			 }
			 if(nums[i] == 0)
				 i --;
		 }
	 }
}

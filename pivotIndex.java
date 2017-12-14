package leetcode;

import java.util.Arrays;

class Solution {
	public int pivotIndex(int[] nums) {
		int sum = 0;
		for(int i=0;i<nums.length;i++){
			sum += nums[i];
		}
		for(int i=0;i<nums.length;i++){
			int left = 0;
			for(int j=0;j<i;j++){
				left += nums[j];
			}
			int right = sum - left - nums[i];
			if(left == right)
				return i;
		}
		return -1;
    }
}

package leetcode;

import java.util.Arrays;

class Solution {
public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int res = 0;
        if (nums.length == 0)
        	return 0;
        for(int i=1; i<nums.length; i++ ){
        	if(nums[i]>nums[i-1])
        		count += 1;
        	else{
        		res = Math.max(res, count);
        		count = 1;
        	}	
        }
        res = Math.max(res, count);
		return res;
    }
}

	
	
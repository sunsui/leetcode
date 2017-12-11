package leetcode;

import java.util.Arrays;

class Solution {
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // --- --0 --+ -0+ -++ 0++ +++  //    
       //return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        if(nums[nums.length-3]>=0 
        		|| nums[nums.length-1]<0 
        		||(nums[nums.length-3]<0 && nums[nums.length-2]>0)
        		) // +++  0++ --- -++
        	return nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1];
        else if(nums[nums.length-2]<=0 || nums[nums.length-1]==0 ) //-0+ --+ --0
        	return nums[0]*nums[1]*nums[nums.length-1];
        	
        return 0;
       
    }
}

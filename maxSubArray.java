package leetcode;

import java.util.Arrays;

class Solution {
	public int maxSubArray(int[] nums) {
       
		//Ð§ÂÊµÍ
//		int max = nums[0];
//        for(int k=1; k <= nums.length;k++){
//        	int sum = 0 ;
//        	for (int i = 0; i < k; i++) 
//            	sum += nums[i];
//        	int maxk = sum;
//        	for (int i = k; i < nums.length; i++) {
//                sum += nums[i] - nums[i - k];
//                maxk = Math.max(maxk, sum);
//            }
//        	 max = Math.max(maxk, max);
//        }
//        return max;
		int maxSoFar=nums[0], maxEndingHere=nums[0];
	    for (int i=1;i<nums.length;++i){
	    	maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
	    }
	    return maxSoFar;
    }
}

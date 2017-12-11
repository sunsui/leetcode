package leetcode;

import java.util.Arrays;

class Solution {
	public double findMaxAverage(int[] nums, int k) {
        
		double sum = 0;
        for (int i = 0; i < k; i++) 
        	sum += nums[i];
        double max = sum;
        
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        
        return max / k;
        
        //Ê±¼äÌ«³¤
		/*
        double sum = -10000*k ;
		double sumtmp ;
		for(int i=0;i<nums.length-k+1;i++){
			sumtmp =0;
        	for(int j=0;j<k;j++){
        		sumtmp += nums[i+j];
        	}
        	sum = Math.max(sumtmp, sum);
        }
        
        return sum/k;
       */ 
    }
}

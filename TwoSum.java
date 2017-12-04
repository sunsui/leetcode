package leetcode;

import java.util.Arrays;

class Solution {
	//for中break只能跳出一层循环
	public int[] twoSum(int[] nums, int target) {
		int i = 0;
		int j = i;
		int[] res = new int[]{i,j};
		for (i = 0 ; i < nums.length ; i++){
        	for(j = i+1 ; j < nums.length ; j++){
        		if (nums[i]+nums[j]==target){
        			res[0] = i;
        			res[1] = j;
        			return res;
        		}
        	}
        }
		return res;
    }
}
public class TwoSum {
	public static void main(String[] args){
		int[] nums = {3,2,4};
		int target = 6;
		int[] res = new Solution().twoSum(nums, target);
		System.out.println(Arrays.toString(res));
	}
}
	
	
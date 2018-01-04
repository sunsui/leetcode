package leetcode;

import java.util.Arrays;

class Solution {
	public int[] findErrorNums(int[] nums) {
		int[] res = new int[2];
        HashSet set = new HashSet<Integer>();
        for(Integer num : nums){
        	if(!set.add(num))
        		res[0]=num;
        }
        for(int i=1;i<=nums.length;i++){
        	if(!set.contains(i))
        		res[1]=i;
        }
        return res;
    }
}

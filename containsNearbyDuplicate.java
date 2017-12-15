package leetcode;

import java.util.Arrays;

class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		 //time limit
		 //		 for(int i=0;i<nums.length;i++){
//			for(int j=i+1;j<nums.length;j++){
//				if(nums[j] == nums[i] &&  j - i <= k ){
//					return true;
//				}
//			}
//		 }
//		 return false;
		 
//		 Set<Integer> set = new HashSet<Integer>();
//         for(int i = 0; i < nums.length; i++){
//             if(i > k) 
//            	 set.remove(nums[i-k-1]);
//             if(!set.add(nums[i])) 
//            	 return true;
//         }
//         return false;
         
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
             if (map.containsKey(nums[i])) {
                 if (i - map.get(nums[i]) <= k) 
                	 return true;
             }
             map.put(nums[i], i);
         }
         return false;
	  }
}

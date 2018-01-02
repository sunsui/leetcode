package leetcode;

import java.util.Arrays;

class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map = new  HashMap<Integer, Integer>();
       List<Integer> res = new ArrayList<Integer>();
       for(int i = 0; i < nums1.length; i++)
       {
           if(map.containsKey(nums1[i])) 
        	   map.put(nums1[i], map.get(nums1[i])+1);
           else 
        	   map.put(nums1[i], 1);
       }
       //       for(int n1 : nums1){
//    	   if(map.put(n1, 1) != null){
//    		   map.put(n1,map.get(n1)+1);
//    	   }
//       }
       for(int n2 : nums2){
    	   if(map.containsKey(n2)&&map.get(n2)>0){
			   map.put(n2,map.get(n2)-1);
    		   res.add(n2);
    	   }
       }
       int[] rr = new int[res.size()];
       for(int i = 0;i<res.size();i++){
    	   rr[i] = res.get(i);
       }
       return rr;
    }
}

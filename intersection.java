package leetcode;

import java.util.Arrays;

public int[] intersection(int[] nums1, int[] nums2) {
//		Set<String> set = new HashSet();
//		for(Integer num : nums2){
//			String numstr = num.toString();
//			if(nums1.toString().contains(numstr)){
//				set.add(numstr);
//			}
//		}
//		int[] temp = new int[set.size()];
//		int i = 0;
//		for(String setstr : set){
//			int a = Integer.parseInt(setstr);
//			temp[i++] = a;
//		}
//		
//        return temp;
        
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
	
}
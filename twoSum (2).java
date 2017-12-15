package leetcode;

import java.util.Arrays;

class Solution {
	public int[] twoSum(int[] numbers, int target) {
		 //time limit
//		 Integer[] anum = new Integer[numbers.length];
//		 for(int i=0;i<numbers.length;i++){
//			 anum[i] = numbers[i];
//		 }
//		 List<Integer> a = Arrays.asList(anum);
//		 int[] res = new int[2];
//		 for(int i=0;i<numbers.length;i++){
//			 if(a.contains(target - numbers[i])){
//				 res[0] = i+1;
//				 res[1] = a.lastIndexOf(target - numbers[i])+1;
//				 break;
//			 } 
//		 }
//		 return res;
		 
		 //不能得到lastindex
//		 int[] res = new int[2];
//		 for(int i=0;i<numbers.length;i++){
//			 int a = Arrays.binarySearch(numbers , target-numbers[i]);
//			 if(a>=0){
//				 res[0] = i+1;
//				 res[1] = a+1;
//				 break; 
//			 }
//		 }
//		 return res;
		 int[] indice = new int[2];
	     if (numbers == null || numbers.length < 2) 
	    	 return indice;
	     int left = 0, right = numbers.length - 1;
	     while (left < right) {
	         int v = numbers[left] + numbers[right];
	         if (v == target) {
	            indice[0] = left + 1;
	            indice[1] = right + 1;
	            break;
	        } else if (v > target) {
	            right --;
	        } else {
	            left ++;
	        }
	     }
	     return indice;
	 }
}

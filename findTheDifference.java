package leetcode;

import java.util.Arrays;

class Solution {
	public char findTheDifference(String s, String t) {
		

		//		int charCodeS = 0, charCodeT = 0;
//        for (int i = 0; i < s.length(); ++i) 
//        	charCodeS += (int)s.charAt(i);
//        for (int i = 0; i < t.length(); ++i) 
//        	charCodeT += (int)t.charAt(i);
//        return (char)(charCodeT - charCodeS);
			int[] alpha = new int[26];
			for (char c : s.toCharArray())
	            alpha[ c - 'a' ]++;

	        for (char c : t.toCharArray()) {
	           //could do decrement first, then check but yeah
	            if (--alpha[c - 'a'] < 0)
	                return c;
	        }
	        return 0;
    }
}

package leetcode;

import java.util.Arrays;

class Solution {
	public int strStr(String haystack, String needle) {
		// return haystack.indexOf(needle);
		if(needle.length()==0)
			return 0;
		for(int i=0;i<=haystack.length()-needle.length();i++){
			for(int j=0;j<needle.length();j++){
        		if(haystack.charAt(i+j) != needle.charAt(j))
        			break;
        		if(j==needle.length()-1)
            		return i;
        	}
			if(i == haystack.length()-needle.length())
				return -1;
        }
        return -1;
    }
}

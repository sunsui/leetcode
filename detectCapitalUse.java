package leetcode;

import java.util.Arrays;

class Solution {
	public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String lower = word.toLowerCase();
        String lowerfirst = lower.substring(0, 1).toUpperCase()
        		+lower.substring(1, lower.length());
        if(word.compareTo(lower)==0 
    		   || word.compareTo(up)==0 
    		   || word.compareTo(lowerfirst)==0)
       		return true;
        return false;
        
    }
}

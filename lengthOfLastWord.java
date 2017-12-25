package leetcode;

import java.util.Arrays;

class Solution {
	public int lengthOfLastWord(String s) {
		String[] ss = s.split(" ");
		if(ss.length == 0)
			return 0;
		String last = ss[ss.length-1];
		return last.length();
    }
}

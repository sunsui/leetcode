package leetcode;

import java.util.Arrays;

class Solution {
	public int repeatedStringMatch(String A, String B) {
        String tmpa = A;
		int i = 1;
		for(i = 1; ;i++){
        	if(tmpa.contains(B))
        		break;
        	tmpa=tmpa.concat(A);
        	if(tmpa.length()>10000)
        		return -1;	
        }
        return i;
    }
}

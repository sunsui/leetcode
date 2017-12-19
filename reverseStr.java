package leetcode;

import java.util.Arrays;

class Solution {
	public String reverseStr(String s, int k) {
        int count = s.length()/k ;
        String res = "";
        for(int i = 0;i<=count ;i++){
        	if(i%2 == 0 ){
        		StringBuffer sb=new StringBuffer(
        				s.substring(k*i, Math.min(k*(i+1), s.length())));
    			sb=sb.reverse();
    			res = res.concat(sb.toString());
        	}
        	else
        		res = res.concat(s.substring(k*i, Math.min(k*(i+1), s.length())));
        }
        return res;
    }
}

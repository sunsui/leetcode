package leetcode;

import java.util.Arrays;

class Solution {
	public String reverseWords(String s) {
		String[] everys = s.split(",");
		String res = "";
		for(String every : everys){
			StringBuffer sb=new StringBuffer(every);
			sb=sb.reverse();
			res = res.concat(sb.toString()+" ");
		}
		return res.length()>2?res.substring(0,res.length()-1):"";
    }
}

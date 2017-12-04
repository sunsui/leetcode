package leetcode;

import java.util.Arrays;

class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
	//效率不高
//		List<String> st = new ArrayList<String>();
//		for(int i=0;i<s.length()-10;i++){
//        	String stmp = s.substring(i, i+10);
//        	String slast = s.substring(i+1,s.length());
//        	if(slast.indexOf(stmp)>-1){
//        		if(!st.contains(stmp))
//        			st.add(stmp);
//        	}
//        }
//		return st;
		//hashset不重复
		Set set = new HashSet();
		Set st = new HashSet();
		for(int i=0;i<s.length()-9;i++){
			String stmp = s.substring(i, i+10);
        	if(!set.add(stmp))
        		st.add(stmp);
		}
		return new ArrayList(st);
    }
}

	
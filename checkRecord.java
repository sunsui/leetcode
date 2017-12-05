package leetcode;

import java.util.Arrays;

class Solution {
	public boolean checkRecord(String s) {
		char[] attendance = s.toCharArray();
        int Absent = 0;
        int Late = 1;
        for(int i=0;i<attendance.length;i++){
        	if(attendance[i] == 'A'){
        		Absent += 1;
        		if(Absent>1||Late>2)
                	return false;
        	}
        	else if(i<attendance.length-1&&(attendance[i] == 'L')&&attendance[i+1]== 'L'){
        			Late += 1;
            		if(Absent>1||Late>2)
                    	return false;
        	}else if(attendance[i] !=  'L')
        		Late = 1;
        }
        return true;
        
    }
}

package leetcode;

import java.util.Arrays;

class Solution {
	public boolean judgeCircle(String moves) {
        int lrcount = 0;
        int udcount = 0;
        char[] move = moves.toCharArray();
        for(int i=0;i<move.length;i++){
        	if(move[i] == 'R')
        		lrcount --;
        	else if(move[i] == 'L')
        		lrcount ++;
        	else if(move[i] == 'U')
        		udcount --;
        	else if(move[i] == 'D')
        		udcount ++;
        }
        return (lrcount == 0 && udcount ==0);
    }
}

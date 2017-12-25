package leetcode;

import java.util.Arrays;

class Solution {
	public int compress(char[] chars) {
//        int tmp = 1;
//        StringBuilder sb = new StringBuilder();
//        if(chars.length == 1)
//        	return 1;
//        for(int i=1;i<chars.length;i++){
//        	if(chars[i] != chars[i-1] ){
//        		sb.append(chars[i-1]).append(tmp);
//        		tmp = 1;
//        	}
//        	else{
//        		tmp += 1;
//        		if( i == chars.length-1)
//        			sb.append(chars[i-1]).append(tmp);
//        	}	
//        }
//        return sb.length();
        
		int start = 0;
        for(int end = 0, count = 0; end < chars.length; end++) {
            count++;
            if(end == chars.length-1 || chars[end] != chars[end + 1] ) {
                //We have found a difference or we are at the end of array
                chars[start] = chars[end]; // Update the character at start pointer
                start++;
                if(count != 1) {
                    // Copy over the character count to the array
                    char[] arr = String.valueOf(count).toCharArray();
                    for(int i=0;i<arr.length;i++, start++)
                        chars[start] = arr[i];
                }
                // Reset the counter
                count = 0;
            }
        }
        return start;
    }
}

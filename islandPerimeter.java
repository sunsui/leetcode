package leetcode;

import java.util.Arrays;

class Solution {
	public int islandPerimeter(int[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) 
			return 0;
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i > 0 && grid[i-1][j] == 1) 
                    	result -= 2;
                    if (j > 0 && grid[i][j-1] == 1) 
                    	result -= 2;
                }
            }
        }
        return result;
        /*wrong
		int x = grid.length;
		int y = grid[0].length;
		int res = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<x;i++){
        	for(int j=0;j<y;j++){
        			if(i==0){
        				if(grid[i][j]==1){
        					map.put(j,4);
        					if(j>0 && map.get(j-1)!=0){
            					map.put(j,map.get(j)-1);
            					map.put(j-1,map.get(j-1)-1);
            				}
        				}else
        					map.put(j,0);
        			}else{
        				if(map.get(j)==0){
            				map.put(j,map.get(j)+4);
            			}else{
            				map.put(j,map.get(j)+4-2);	
            			}	
        				if(j>0 && map.get(j-1)!=0){
        					map.put(j,map.get(j)-1);
        					map.put(j-1,map.get(j-1)-1);
        				}
        			}
        			
        	}
        }
        for(int j=0;j<y;j++){
        	res += map.get(j);
        }
        return res;
        */
    }
}

package leetcode;

import java.util.Arrays;

class Solution {
	public int numberOfBoomerangs(int[][] points) {
       int x = points.length;
       int res = 0;
       Double[] dist = new Double[x]; 
       Map<Double, Integer> map = new HashMap<>();
       for(int i=0;i<x;i++){
    	   for(int z=0;z<x;z++){
    		   int tmp1 = (points[z][0]-points[i][0]);
    		   int tmp2 = (points[z][1]-points[i][1]);
    		   int tmp = tmp1*tmp1 + tmp2*tmp2; 
    		   dist[i] = Math.sqrt(tmp);
    		   if(map.containsKey(dist[i]))
    			   map.put(dist[i], map.get(dist[i]) + 1);
    		   else
    			   map.put(dist[i], 1);
    	   }
    	   for(int val : map.values())
        	   res += val * (val-1);
    	   map.clear();
       }
       return res;
    }
}

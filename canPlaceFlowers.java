package leetcode;

import java.util.Arrays;

class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
       
		//if (flowerbed[i] == 0 
		//&& (i == 0 || flowerbed[i - 1] == 0) 
		//&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0))
		if(n == 0 || (n==1 && flowerbed.length==1 && flowerbed[0]==0)||
		           (n==1 && flowerbed.length==2 && flowerbed[0]==0 && flowerbed[1]==0) )
					return true;
		        if(flowerbed.length<=2)
					return false;
				if(flowerbed[0]==0 && flowerbed[1]==0){
					flowerbed[0] = 1;
					n -= 1; 
				}
				if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
					flowerbed[flowerbed.length-1] = 1;
					n -= 1;
				}
				for(int i=1;i<flowerbed.length;i++){
					if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
						flowerbed[i] = 1;
						n -= 1;
					}	
		        }
				return n<=0;
    }
}

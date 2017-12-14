package leetcode;

import java.util.Arrays;

class Solution {
	public int maxProfit(int[] prices) {
    
		//time Limit 
//		int profit = 0;
//		for(int i=0;i<prices.length;i++){
//			int maxtmp = 0;
//			for(int j=i+1;j<prices.length;j++){
//				maxtmp = Math.max(maxtmp, prices[j]);
//			}
//			profit =Math.max( maxtmp - prices[i] , profit);
//		}
//		return profit;
		
		if(prices.length == 0)
			return 0;
		int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
        	minprice = Math.min(prices[i], minprice);
        	maxprofit = Math.max(maxprofit, prices[i] - minprice);
        }
        return maxprofit;
    }
}

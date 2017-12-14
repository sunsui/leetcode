package leetcode;

import java.util.Arrays;

class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		
		int[][] res = new int[r][c];
		int row = nums.length;
		int column = 0;
		if(nums.length > 0)
			column = nums[0].length;
		int[] onesum = new int[row*column];
		
		for(int k=0;k<row;k++)
			System.arraycopy(nums[k],0,onesum,k*column,column);
		
		if((row*column != r*c))
			return nums;
		else{
			int index = 0;
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++)
					res[i][j] = onesum[index++];
			}
		}
		return res;
    }
}

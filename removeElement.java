class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j = nums.length;
		for (int i=nums.length; i>0; i--)
	        if (nums[i-1] == val)
	        	nums[i-1]=nums[--j];
		return j;
    }
}
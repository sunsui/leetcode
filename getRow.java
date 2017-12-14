package leetcode;

import java.util.Arrays;

class Solution {
	public List<Integer> getRow(int rowIndex) {
		
		List<Integer> res = new ArrayList<Integer>();
	    for(int i = 0;i<rowIndex+1;i++) {
	    		res.add(1);
	    		for(int j=i-1;j>0;j--) {
	    			res.set(j, res.get(j-1)+res.get(j));
	    		}
	    }
	    return res;
	    
//		List<Integer> origin = new ArrayList<Integer>();
//		List<Integer> curr = new ArrayList<Integer>();
//		origin.add(1);
//		origin.add(1);
//		if (rowIndex == 0){
//			curr.add(1);
//			return curr;
//		}
//		if(rowIndex == 1){
//			curr.add(1);
//			curr.add(1);
//			return curr;
//		}
//		for(int i=1;i<rowIndex;i++){
//			curr.add(origin.get(0)+0);
//			for(int j=0;j<origin.size()-1;j++){
//				curr.add(origin.get(j)+origin.get(j+1));
//			}
//			curr.add(origin.get(origin.size()-1)+0);
//
//			int originsize = origin.size();
//			for(int k=0;k<originsize;k++)
//				origin.remove(0);
//			int currsize = curr.size();
//			for(int k=0;k<currsize;k++){
//				origin.add(curr.get(0));
//				curr.remove(0);
//			}
//				
//		}
//		return origin;
		
    }
}

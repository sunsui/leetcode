package leetcode;

import java.util.Arrays;

class Solution {
	public String[] findWords(String[] words) {
		
		String[] bases ={ "qwertyuiop" , "asdfghjkl" , "zxcvbnm" }; 
        List<String> res = new ArrayList<String>();
        for(String word : words){
        	for(String base : bases){
        		boolean thisword = true;
        			for(int i=0;i<word.length();i++){
            			if(base.indexOf(word.subSequence(i, i+1).toString().toLowerCase())<0){
            				thisword = false;
            				break;
            			}
            		}
	        		if(thisword)
	        			res.add(word);
        	}
        }
        //hashmap ·½·¨
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2= new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        for(char c: bases[0].toCharArray()){
        	map1.put(String.valueOf(c), 1);
        }
        for(char c: bases[1].toCharArray()){
        	map2.put(String.valueOf(c), 1);
        }
        for(char c: bases[2].toCharArray()){
        	map3.put(String.valueOf(c), 1);
        }
        for(String word : words){
        	boolean m1 = true, m2 = true, m3 = true;
        	for(char c : word.toCharArray()){
        		if(!map1.containsKey(String.valueOf(c).toLowerCase())){
        			m1 = false;
        			break;
        		}
        	}
        	for(char c : word.toCharArray()){
        		if(!map2.containsKey(String.valueOf(c).toLowerCase())){
        			m2 = false;
        			break;
        		}
        	}
        	for(char c : word.toCharArray()){
        		if(!map3.containsKey(String.valueOf(c).toLowerCase())){
        			m3 = false;
        			break;
        		}
        	}
        	if(m1 || m2 || m3)
        		res.add(word);
        	
        }
        String[] anc = new String[res.size()];
        for(int i =0; i<res.size();i++)
        	anc[i] = res.get(i);
        return anc;
	}
}

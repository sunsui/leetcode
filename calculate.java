package leetcode;

import java.util.Arrays;

class Solution {
	public int calculate(String s) {
//        List <String> str = new ArrayList<String> ();
//        List <String> st = new ArrayList<String> ();
//        int k = 0;
//        if(s.substring(0,1).equals(" "))
//        	k=1;
//        for(int j =k ; j<s.length();j++){
//        	if(!s.substring(j, j+1).equals(" ")){
//        		if(str.size()==0)
//        			str.add(s.substring(j, j+1));
//        		else{
//        			String strj = str.get(str.size()-1);
//            		String sj = s.substring(j, j+1);
//            		if(!(strj.equals("+")||strj.equals("-")||
//            				strj.equals("*")||strj.equals("/"))
//            				&&
//            				!(sj.equals("+")||sj.equals("-")||
//                    				sj.equals("*")||sj.equals("/")))
//            			str.set(str.size()-1, str.get(str.size()-1).concat(sj));
//            		else
//            			str.add(s.substring(j, j+1));
//        		}
//        		
//        	}
//        }
//        for(int i=1; i<str.size()-1;i++){
//      //  	System.out.println(str.get(i));
//    		if(str.get(i).equals("*")){
//        		Integer num = (Integer.parseInt(str.get(i-1)) * Integer.parseInt(str.get(i+1)));
//        		st.add(num.toString());
//        		i+=1;
//        	}
//        	else if(str.get(i).equals("/")){
//        		Integer num = (Integer.parseInt(str.get(i-1)) / Integer.parseInt(str.get(i+1)));
//        		st.add(num.toString());
//        		i+=1;
//        	}
//        	else
//        		st.add(str.get(i));
//        }
//        st.add(str.get(str.size()-1));
//        Integer temp = Integer.parseInt(st.get(0));
//        for(int i=1; i<st.size();i++){
//        	if(st.get(i).equals("+"))
//        		temp = temp + Integer.parseInt(st.get(i+1));
//        	else if(st.get(i).equals("-"))
//        		temp = temp - Integer.parseInt(st.get(i+1));
//        }
//        return temp;
		int len;
	    if(s==null || (len = s.length())==0) 
	    	return 0;
	    Stack<Integer> stack = new Stack<Integer>();
	    int num = 0;
	    char sign = '+';
	    for(int i=0;i<len;i++){
	        if(Character.isDigit(s.charAt(i))){
	            num = num*10+s.charAt(i)-'0';
	        }
	        if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
	            if(sign=='-'){
	                stack.push(-num);
	            }
	            if(sign=='+'){
	                stack.push(num);
	            }
	            if(sign=='*'){
	                stack.push(stack.pop()*num);
	            }
	            if(sign=='/'){
	                stack.push(stack.pop()/num);
	            }
	            sign = s.charAt(i);
	            num = 0;
	        }
	    }

	    int re = 0;
	    for(int i:stack){
	        re += i;
	    }
	    return re;
    }
}

	
	
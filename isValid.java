package leetcode;

import java.util.Arrays;

class Solution {
	public boolean isValid(String s) {
		
		Stack<Character> s1 = new Stack();
		char[] ss = s.toCharArray();
		for(int i =0; i<ss.length ;i++){
			if(s1.isEmpty())
				s1.push(ss[i]);
			else if(s1.peek()=='('){
				if(ss[i]=='('||ss[i]=='['||ss[i]=='{')
					s1.push(ss[i]);
				else if(ss[i]==')')
					s1.pop();
				else
					return false;
			}
			else if(s1.peek()=='['){
				if(ss[i]=='('||ss[i]=='['||ss[i]=='{')
					s1.push(ss[i]);
				else if(ss[i]==']')
					s1.pop();
				else
					return false;
			}
			else if(s1.peek()=='{'){
				if(ss[i]=='('||ss[i]=='['||ss[i]=='{')
					s1.push(ss[i]);
				else if(ss[i]=='}')
					s1.pop();
				else
					return false;
			}
			else
				return false;
		}
		return s1.isEmpty();
		
//		Stack<Character> stack = new Stack<Character>();
//		for (char c : s.toCharArray()) {
//			if (c == '(')
//				stack.push(')');
//			else if (c == '{')
//				stack.push('}');
//			else if (c == '[')
//				stack.push(']');
//			else if (stack.isEmpty() || stack.pop() != c)
//				return false;
//		}
//		return stack.isEmpty();
		
    }
}

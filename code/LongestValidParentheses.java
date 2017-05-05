package com.lxy.code;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4,5,6,7,8,9,0};
	}
	
	public int longestValidParentheses(String s) {
		int l = s.length();
		if(l<2) return 0;
		Stack<Character> stack = new Stack<Character>();
		int temp=0;
		int num=0;
		int result=0;
		for(int i=0;i<l;i++){
			if(stack.isEmpty()){
				stack.push(s.charAt(i));
				continue;
			}
			if(stack.peek().equals(')')) {
				result=Math.max(result, num);
				num=0;
				stack.clear();
				stack.push(s.charAt(i));
				continue;
			}
			if(s.charAt(i)==')'){
				num+=2;
				stack.pop();
			}else{
				stack.push(s.charAt(i));
			}
		}
		if(stack.isEmpty()) result=Math.max(result, num);
		return result*2;
    }

}

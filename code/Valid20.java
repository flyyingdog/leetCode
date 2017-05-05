package com.lxy.code;

import java.util.ArrayList;
import java.util.Stack;

import javax.xml.stream.events.Characters;

public class Valid20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int l = s.length();
		if(l==0) return true;
		for(int i = 0;i<l;i++){
			if(stack.isEmpty()){
				stack.add(s.charAt(i));
			}else{
				if(isMatch(stack.peek(),s.charAt(i))){
					stack.pop();
				}else{
					if("}])".indexOf(s.charAt(i))!=-1){
						return false;
					}
					stack.add(s.charAt(i));
				}
			}
		}
		return stack.isEmpty();
    }
	
	public boolean isMatch(char x,char y ){
		if(x=='{' && y=='}' || x=='(' && y==')' || x=='[' && y==']') return true;
		return false;
	}
}

package com.lxy.code;

public class IsPalindrome {
	public static void main(String []args){
		IsPalindrome ip = new IsPalindrome();
		int x = 0;
		System.out.println(ip.palindrom(x));
	}
	
	public boolean palindrom(int x ){
		if(x<10 && x>-10) return true;
		boolean flag = false;
		int tail = 0;
		int result = 0;
		while(x!=0){
			tail = x % 10;
			result = result * 10 + tail;
			x = x/10;
			if(x==result || x/10==result) return true;
		}
		
		return false;
	}
}

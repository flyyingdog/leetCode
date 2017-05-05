package com.lxy.code;


public class LongestPalindromicSubstring {
	public static int longest = 0;
	public static int start = 0;
	public static int stop = 0;
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ccc";
		System.out.println("result is : "+longestPalindrome(s));

	}
	
	public static String longestPalindrome(String s) {
		if(s.length()<2) return s;
        int i=0;
        while(i<s.length()){
        	System.out.println(count++);
        	if(i<s.length()-1 ){
        		findMedia(s,i,1);
        		findMedia(s,i,0); i++;
        	}else{
        		findMedia(s,i,0); i++;
        	}
        }
        System.out.println("start :" + start + " stop " + stop + "longest :"+ longest);
        return s.substring(start,stop+1);
    }
    
	public static void  findMedia(String s,int idx,int x ){
		int length=0;
		int left=idx;
		int right=idx+x;


		while(left>0 && right < s.length()-1 && s.charAt(left)==s.charAt(right)){
			left--;right++;
		}
		if(s.charAt(left)!=s.charAt(right)) {
			left++;right--;
		}
		length = right-left+1;
		if(length>longest){
			longest = length;
			start = left;
			stop = right;
		}

	}
}
/**
 * 0       8
 * 1     7 9
 * 2   6   10
 * 3 5     11
 * 4       12
 **/

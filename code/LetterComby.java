package com.lxy.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterComby {
	HashMap<Character,String> map;
	List<String> list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterComby lc = new LetterComby();
		String digits = "2";
		System.out.println(lc.letterCombinations(digits));
	}
	
	public List<String> letterCombinations(String digits) {
		int l = digits.length();
		list = new LinkedList<String>(); 
		if(l==0) return list;
		map = new HashMap< Character , String>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		StringBuffer pre = new StringBuffer();
		twoNum(pre,digits,0,l-1);
		
		return list;
    }
	
	public void twoNum(StringBuffer pre,String digits , int count,int end){
		StringBuffer buffer;
		String c = map.get(digits.charAt(count));
		if(count<end){
			for(int i = 0 ;i<c.length();i++){
				buffer=new StringBuffer(pre);
				twoNum(buffer.append(c.charAt(i)),digits,count+1,end);
			}
		}else{
			for(int i = 0 ;i<c.length();i++){
				buffer=new StringBuffer(pre);
				list.add(buffer.append(c.charAt(i)).toString());
			}
		}
	}
}

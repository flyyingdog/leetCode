package com.lxy.code;

public class RemoveDuplicates26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int removeDuplicates(int[] nums) {
    	int l = nums.length;
    	int m = l;
    	if(l==0 || l==1) return l;
    	for(int i = 0;i < l-1;i++){
    		if(nums[i]==nums[i+1]) m--; 
    	}
    	return m;
    }
    String str1 = "abc";
    String str2 = "ab";
    int i = str1.indexOf(str2);

}

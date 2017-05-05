package com.lxy.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations2 {
	List<List<Integer>> result;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
	} 	
	
	public List<List<Integer>> permuteUnique(int[] nums) {
    	result = new ArrayList<List<Integer>>();
    	int l = nums.length;
    	if(l==0) return result;
    	if(l==1) {
    		List<Integer> list = new ArrayList<Integer>(nums[0]);
    		result.add(list);
    		return result;
    	}
    	Arrays.sort(nums);
    	operation(nums,new ArrayList<Integer>(),0,l);
    	return result;
    }
    
    public void operation(int[] nums,List<Integer> cuResult,int idx,int l){
    	if(idx==l) result.add(cuResult);
    	else{
    		for(int i = idx;i<l;i++){
    			if(i>0 && nums[i]!=nums[i-1] || i==0){
    				ArrayList<Integer> nextresult = new ArrayList<Integer>(cuResult);
    				nextresult.add(nums[i]);
    				operation(nums,nextresult,i+1,l);
    			}
    		}
    	}
    }

}

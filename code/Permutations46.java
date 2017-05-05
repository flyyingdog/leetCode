package com.lxy.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutations46 {
	List<List<Integer>> result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> permute(int[] nums) {
    	result = new ArrayList<List<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	int l = nums.length;
    	for(int i = 0;i<l;i++){
    		list.add(nums[i]);
    	}
    	operation(list,new ArrayList<Integer>(),l);
    	return null;
    }
    
    public void operation(List<Integer> lastlist,List<Integer> cuResult,int n){
    	if(n==0) result.add(cuResult);
    	else{
    		for(int i = 0;i<n;i++){
    			ArrayList<Integer> nextlast = new ArrayList<Integer>(lastlist);
    			ArrayList<Integer> nextresult = new ArrayList<Integer>(cuResult);
    			nextresult.add(nextlast.remove(i));
    			operation(nextlast,nextresult,n-1);
    		}
    	}
    }

}

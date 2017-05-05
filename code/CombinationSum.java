package com.lxy.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		int i=0;
		int l = candidates.length;
		int j=l-1;
		while(j>i){
			int temp = candidates[i];
			candidates[i]=candidates[j];
			candidates[j]=temp;
			i++;j--;
		}
		HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
		ArrayList<List<Integer>> test = new ArrayList<List<Integer>> (hs);
		for(i = 0;i<l;i++){
			recursion(candidates, target, i, new ArrayList<Integer>(i));
		}
		return null;
    }
	
	public void recursion(int[] candidates,int target,int idx,List<Integer> before){
		if(target==0) {
			list.add(before);
			return;
		}
		if(target<0) return;
		for(int i = idx;i<candidates.length;i++){
			before.add(candidates[i]);
			recursion(candidates, target-candidates[i], i+1, before);
			before.remove(before.size()-1);
		}
	}
}

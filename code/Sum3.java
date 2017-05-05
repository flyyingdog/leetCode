package com.lxy.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum3 sum3 = new Sum3();
		int[] nums={-10,0,-2,3,-8,1,-10,8,-8,6,-7,0,-7,2,2,-5,-8,1,-4,6};
		int target = 18;
		System.out.println(sum3.threeSumClosest(nums, target));

	}
	
	public int threeSumClosest(int[] nums, int target) {
		int l=nums.length;
		if(l==3) return nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
		if(nums[0]+nums[1]+nums[2]>target) return nums[0]+nums[1]+nums[2];
		if(nums[l-1]+nums[l-2]+nums[3]<target) return nums[l-3]+nums[l-2]+nums[l-1];
		int result=Integer.MAX_VALUE;
		int tResult=nums[0]+nums[1]+nums[l-1];
		for(int i =0;i<l-2;i++){
			if(i!=0&&nums[i-1]==nums[i]) continue;
			int j = i+1;
			int k = l-1;
			while(j!=k){
				int sum=nums[i]+nums[j]+nums[k];
				int temp = sum-target;
				if(Math.abs(result) > Math.abs(temp)){
					result=temp;
					tResult = sum;
				}
				result=Math.abs(result) <= Math.abs(temp)?result:temp;
				if(temp>0) k--;
				else j++;
			}
		}
		return tResult;
    }
	
}

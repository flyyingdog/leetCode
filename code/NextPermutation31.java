package com.lxy.code;

import java.util.Arrays;

public class NextPermutation31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void nextPermutation(int[] nums) {
		int l = nums.length;
		if(l<2) return;
		for(int i = l-2;i>0;i--){
			if(nums[l-1]<nums[i]){
				int temp = nums[i];
				nums[i]=nums[l-1];
				nums[l-1]=temp;
				return;
			}else if(nums[l-1]>nums[i]){
				for(int j=i;j<l;j++){
					if(nums[i-1]<nums[j]){
						int temp = nums[j];
						nums[j] = nums[i-1];
						nums[i-1] = temp;
						return;
					}
				}
			}
		}
    }

}

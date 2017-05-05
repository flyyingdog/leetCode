package com.lxy.code;

public class SearchForRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,3,4,5,5,7,7,9};
		int target = 0;
		SearchForRange sfr = new SearchForRange();
	}
    
	public int[] searchRange(int[] nums, int target) {
		int l = nums.length;
		int[] result = {-1,-1};
		if(l<1 || nums[l-1]<target || nums[0]>target) return result;
		int left = 0;
		int right = l-1;
		int mid = 0;
		while(left!=right){
		    if(right-left==1) {
		        if(left<target) {
		            mid=left+1;break;
		        }
		        else{
		        	mid = left;break;
		        }
		    }
			else mid = (left+right)/2;
			if(nums[mid]==target) break;
			if(nums[mid]<target) left = mid;
			else right = mid;
		}
		if(nums[mid]!=target) return result;
		int lLeft = left;
		int lRight = mid;
		int rLeft = mid;
		int rRight = right;
		int leftMid = 0;
		int rightMid = l-2;
		if(nums[0]==target) leftMid=-1;
		else{
			while(!(nums[leftMid]<target && nums[leftMid+1]==target)){
				leftMid = (lLeft+lRight)/2;
				if(nums[leftMid]<target) lLeft = leftMid;
				else lRight = leftMid;
			}
		}
		if(nums[l-1]==target) leftMid = l-1;
		else{
			while(!(nums[rightMid]==target && nums[rightMid+1]>target)){
				rightMid = (rLeft+rRight)/2;
				if(nums[rightMid]>target) rRight = rightMid;
				else rLeft = rightMid;
			}
		}
		result[0] = leftMid+1;
		result[1] = rightMid;
		return result;
	}
}

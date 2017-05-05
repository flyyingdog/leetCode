package com.lxy.code;

public class JumpGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame2 jg = new JumpGame2();
		int[] nums = {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
		System.out.println(jg.jump(nums));
	}
	
	public int jump(int[] nums) {
        int l = nums.length;
        if(l<2) return 0;
        int result = 0;
		return minStep(nums,0,l,result);
    }
	
	public int minStep(int[] nums,int idx,int l,int result){
		if(idx==l-1) return 0;
		if(nums[idx]==0) return Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums[idx] && i+idx+1<l;i++){
			int temp = minStep(nums,idx+i+1,l,result+1);
			if(temp<0 || temp ==Integer.MAX_VALUE) continue;
			if(temp<min) min = temp;
		}System.out.println("index is:" + idx + " min is : "+min);
		
		if(min==Integer.MAX_VALUE || min<0) return Integer.MAX_VALUE;
		return 1+min;
	}
}

package com.lxy.code;

public class MaxArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxArea ma = new MaxArea();
		int[] height = new int[15000];
		for(int i=0;i<15000;i++){
			height[i]=i+1;
		}
		System.out.println(ma.max(height));

	}
	
	public int max(int[] height){
		int result = 0;
		int l = height.length;
		int area = 0;
		for(int i = 0;i<(l-1);i++){
			for(int j = l-1;j>i;j--){
				if(height[j]>=height[i]){
					area = height[i] * (j-i);
					result=Math.max(result,area);
					break;
				}
			}
		}
		for(int i = l-1;i>0;i--){
			for(int j = 0;j<i;j++){
				if(height[j]>=height[i]){
					area=height[i]*(i-j);
					result=Math.max(result, area);
				}
			}
		}
		return result;
	}
}

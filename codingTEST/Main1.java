package com.lxy.codingTEST;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<3){
			System.out.print(-1);
			return;
		}
		int[] nums = new int[n];
		for(int i = 0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		sort(nums,0,nums.length-1);
		Arrays.sort(nums);
//		for(int i = 0;i<n;i++){
//			System.out.print(nums[i]+" ");
//		}
		int N = 3;
		int count = 1;
		for(int i = 1;i<n;i++){
			if(count==N) {
				System.out.print(nums[i]);
				return;
			}
			if(nums[i]!=nums[i-1]){
				count++;
			}
		}
		System.out.println(-1);
    }

    public static int partition(int []array,int lo,int hi){
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }

    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }
}
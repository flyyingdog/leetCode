package com.lxy.codingTEST;


import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		buildMinHeap(nums);
		for(int i = 3;i>1;i--){
			int temp = nums[0];
			nums[0] = nums[i-1];
			nums[i-1] = temp;
			minHeapify(nums,1,i-1);
		}
		for(int i = 0;i<n;i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println(nums[0]);
	}

//    public static void sort(Comparable[] data) {
//        buildMinHeap(data);
//        for (int i = data.length; i > 1; i--) {
//            Comparable tmp = data[0];
//            data[0] = data[i - 1];
//            data[i - 1] = tmp;
//
//            // 堆的长度减少1，排除置换到最后位置的根节点
//            minHeapify(data, 1, i - 1);
//        }
//    }

    private static void buildMinHeap(int[] data) {
        for (int i = data.length / 2; i > 0; i--) {
            minHeapify(data, i, data.length);
        }
    }

    private static void minHeapify(int[] data, int parentNodeIndex, int heapSize) {
        int leftChildNodeIndex = parentNodeIndex * 2;
        int rightChildNodeIndex = parentNodeIndex * 2 + 1;
        int largestNodeIndex = parentNodeIndex;

        if (leftChildNodeIndex <= heapSize && data[leftChildNodeIndex - 1]-data[parentNodeIndex - 1] < 0) {
            largestNodeIndex = leftChildNodeIndex;
        }

        if (rightChildNodeIndex <= heapSize && data[rightChildNodeIndex - 1]-data[largestNodeIndex - 1] < 0) {
            largestNodeIndex = rightChildNodeIndex;
        }

        if (largestNodeIndex != parentNodeIndex) {
            int tmp = data[parentNodeIndex - 1];
            data[parentNodeIndex - 1] = data[largestNodeIndex - 1];
            data[largestNodeIndex - 1] = tmp;

            minHeapify(data, largestNodeIndex, heapSize);
        }
    }

}

	



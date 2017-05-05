package com.lxy.code;

public class RotateImage48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{1,2,3}};
		int l = matrix.length;
		System.out.println(l);
	}
	
	public void rotate(int[][] matrix) {
		int l = matrix.length;
		int n =l/2-1;
		for(int i = 0;i<n;i++){
			rorateOneRoll(matrix,i,l);
		}
		
    }
	
	public void rorateOneRoll(int[][] matrix,int idx,int n){
		for(int i = idx;i<n-idx;i++){
			int row = idx;
			int cow = i;
			int nextRow = cow;
			int nextCow = n-row;
			int temp=matrix[row][cow];
			int temp2 = matrix[nextRow][nextCow];
			for(int j = 0;j<4;j++){
				row = nextRow;
				cow = nextCow;
				nextRow = cow;
				nextCow = n-row;
				matrix[row][cow]=temp;
				temp=temp2;
				temp2=matrix[nextRow][nextCow];
			}
		}
	}

}

/**
 * 1 1 1 1 1    1 1 1 1 
 * 2 2 2 2 2    2 2 2 2 
 * 3 3 3 3 3    3 3 3 3 
 * 4 4 4 4 4	4 4 4 4 	
 * 5 5 5 5 4
 **/ 

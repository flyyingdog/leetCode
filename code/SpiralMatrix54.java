package com.lxy.code;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res  = new ArrayList<Integer>();
    	int row = matrix.length;
    	if(row<1) return res;
    	int col = matrix[0].length;
    	for(int i = 1;i<=(Math.min(row, col)+1)/2+1;i++){
    		round(matrix,row,col,i,res);
    	}
    	return res;
    }
    
    public List<Integer> round(int[][] matrix,int row,int col,int n,List<Integer> res){
    	for(int i = n-1;i<col-n;i++)
    		res.add(matrix[n-1][i]);
    	
    	for(int i = n-1;i<row-n;i++)
    		res.add(matrix[i][col-n]);
    	
    	for(int i = col-n;i>n-2;i--)
    		res.add(matrix[row-n][i]);
    	
    	for(int i = row-n-1;i>n-1;i--)
    		res.add(matrix[i][n-1]);
    	
    	return res;
    }
}
/**
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 
 * 
 * 
 **/

package com.lxy.codingTEST;

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class CodingInAll {
	
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(sc.hasNextLine()){
			String s = sc.nextLine();
		}
	}
	
	
	
	
	

	public int uniquePaths(int m, int n) {
		if (m == 1 || n == 1)
			return 1;
		m--;
		n--;
		if (m < n) { // Swap, so that m is the bigger number
			m = m + n;
			n = m - n;
			m = m - n;
		}
		long res = 1;
		int j = 1;
		for (int i = m + 1; i <= m + n; i++, j++) { // Instead of taking
													// factorial, keep on
													// multiply & divide
			res *= i;
			res /= j;
		}

		return (int) res;
	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int res = 0;
		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;
		res = uniquePaths(row, col);
		for(int i=0;i<row;i++){
			for(int j = 0;j<col;j++){
				if(obstacleGrid[i][j]==1) 
					res=res-uniquePaths(i+1, j+1)*uniquePaths(row-i, col-j);
			}
		}
		return res;
	}
	
	public boolean isNumber(String s) {
		String res = s.trim();
		int l = res.length();
		if(l==0) return false;
		for(int i = 0;i<l;i++){
			char c = res.charAt(i);
		}
		StringBuffer sb = new StringBuffer();
		return true;
    }
	/**
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> res = new ArrayList<String>();
		int l = words.length;
		if(l<1) return res;
		int begin=0;
		int end = 0;
		
		for(int i = )
		return res;
	}
	**/
	
	public String simplifyPath(String path) {
		String[] str = path.split("/");
		int n = str.length;
		Stack<String> st = new Stack<String>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<n;i++){
			if(str[i].equals(".")) continue;
			else if(str[i].equals("..")){
				if(st.isEmpty()) continue;
				else{
					st.pop();
				}
			}else{
				st.add(str[i]);
			}
		}
		if(st.isEmpty()) return "/";
		java.util.Iterator<String> it = st.iterator();
		if(path.charAt(0)=='/') it.next();
		while(it.hasNext()){
			sb.append("/"+it.next());
		}
		return sb.toString();
    } 

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        if(target<matrix[0][0] || target>matrix[row-1][col-1]) return false;
        int r = 0;
        while(target>matrix[r][0] || r!=row)
        	r++;
        r--;
        int left=0;
        int right = col-1;
        while(left!=right){
        	int m = (left+right)/2;
        	if(target<matrix[r][m]){
        		right=m;
        	}else if(target>matrix[r][m]){
        		left=m+1;
        	}else{
        		return true;
        	}
        }
        if(matrix[r][left]==target) return true;
        return false;
    }
	
	 public void sortColors(int[] nums) {
		 Arrays.sort(nums);
	 }
	 
	 public String minWindow(String s, String t) {
		 int ls = s.length();
		 int lt = t.length();
		 int[] nums = new int[lt];
		 nums[lt-1] = lt-1;
		 int resl = lt-1;
		 for(int i=0;i<ls;i++){
			 
		 }
		 return null;
				 
	 }
	 
	 public boolean exist(char[][] board, String word) {
		 int row = board.length;
		 if(row==0) return false;
		 int col = board[0].length;
		 for(int i = 0;i<row;i++){
			 for(int j = 0;j<col;j++){
				 char[][] temp = new char[row][];
				 System.arraycopy(board, 0, temp, 0, row);
//				 char[][] temp = new char[][](board);
				 return smartExist(board,row,col,i,j,word,0);
			 }
		 }
		 return true;
	 }
	 
	 public boolean smartExist(char[][] board,int row,int col,int x,int y,String word,int idx){
		 if(x<0 || x>row-1 || y<0 || y>col-1) return false;
		 char c = word.charAt(idx);
		 if(board[x][y]==c){
			 if(idx==word.length()-1) return true;
			 else return smartExist(board,row,col,x+1,y,word,idx+1) ||
					 smartExist(board,row,col,x-1,y,word,idx+1) ||
					 smartExist(board,row,col,x,y-1,word,idx+1) ||
					 smartExist(board,row,col,x,y+1,word,idx+1);
		 }else{
			 return false;
		 }
	 }
	 
	 public int largestRectangleArea(int[] heights) {
		 
		 return 0;
	 }
	 public List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList<Integer>();
        if(n==0) {
            res.add(0);
            return res;
        }
        res = new ArrayList<Integer>(grayCode(n-1));
        int l = res.size();
        double y = Math.pow(2, n-1);
        int x = (int)y;
        for(int i =l-1;l>=0;i--){
        	res.add(x);
        }
        return res;
	 }
	 
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 List<Integer> remove = new ArrayList<Integer>();
		 List<List<Integer>> subs = new ArrayList<List<Integer>>();
         int n = nums.length;
         if(n==0) return res;
         Arrays.sort(nums);
         res.add(new ArrayList<Integer>());
         
         for(int i = 0;i<n;i++){
        	 if(i>0 && nums[i]!=nums[i-1]){
        		 subs =  new ArrayList<List<Integer>>(res);
        	 }
        	 List<List<Integer>> temp = new ArrayList<List<Integer>>();
         	 for(List<Integer> sub :subs){
         		 List<Integer> a = new ArrayList<Integer>(sub);
         		 a.add(nums[i]);
         		 temp.add(a);
         	}
         	res.addAll(temp);
         	subs = new ArrayList<List<Integer>>(temp);
         }
		 return res;
	 }
	 
	 public int numDecodings(String s){
		 int n = s.length();
		 int zero,one,res,lastNum;
		 zero=0;one=0;lastNum=0;res=0;
		 for(int i = 0;i<n;i++){
			 if(i==0){
				 res=1;zero=0;one=1;
				 lastNum=Integer.valueOf(s.charAt(i));
				 continue;
			 }
			 int num = Integer.valueOf(s.charAt(i));
			 if(lastNum<2){
				 res=zero+one;
				 zero=one;
				 one=res;
			 }else if(lastNum>2){
				 res=one+1;
				 zero=one;
				 one=res;
			 }else{
				 if(num>6){
					 res=one;
					 zero=one;
					 one = res;
				 }else{
					 res=zero+one;
					 zero=one;
					 one=res;
				 }
			 }
			 lastNum=num;
		 }
		 return res;
	 }
	 
	 public List<List<Integer>> pathSum(TreeNode root, int sum){
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 if(root==null) return res;
		 return null;
	 }
	 
	 public void sum(TreeNode root,int sum,List<Integer> list,List<List<Integer>> res){
		 if(root==null) return;
		 sum=sum-root.val;
		 list.add(root.val);
		 if(root.left == null && root.right == null	&& sum==0) {
			 res.add(list);
		 }else{
			 List<Integer> temp = new ArrayList<Integer>(list);
			 sum(root.left,sum,list,res);
			 sum(root.right,sum,temp,res);
		 }
	 }
	 
	 public List<Integer> getRow(int rowIndex){
		 List<Integer> res = new ArrayList<Integer>();
		 for(int i = 0;i<=rowIndex;i++){
			 res.add(0, 1);
			 for(int j = 1;j<i;j++){
				 res.set(j, res.get(j)+res.get(j+1));
			 }
		 }
		 return res;
	 }

	 
	 class Point {
	     int x;
	     int y;
	     Point() { x = 0; y = 0; }
	     Point(int a, int b) { x = a; y = b; }
	 }
	  
	 private int res = 0;
	 public int maxPoints(Point[] points){
		 return res;
	 }
	 
	 public void max(Point[] poinst,int m,int k,int l,int value){
		 
	 }
}

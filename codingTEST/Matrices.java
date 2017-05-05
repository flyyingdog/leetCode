package com.lxy.codingTEST;


import java.util.*;

public class Matrices {

   public static void main(String[] args) {

      Scanner stdIn = new Scanner(System.in);
      int rows, cols; // 行数与列数

      System.out.print("Enter number of rows and columns" 
                       + " for 1st matrix: ");
      rows = stdIn.nextInt();
      cols = stdIn.nextInt();
      int[][] arrA = new int[rows][cols];
      arrA = readArray(stdIn, rows, cols);
      
      System.out.print("Enter number of rows and columns" 
                       + " for 2nd matrix: ");
      rows = stdIn.nextInt();
      cols = stdIn.nextInt();
      int[][] arrB = new int[rows][cols];
      arrB = readArray(stdIn, rows, cols);

      System.out.println("1st matrix:");
      printArray(arrA);

      System.out.println("2nd matrix:");
      printArray(arrB);

      System.out.print("Choose (1)Sum or (2)Product? " );
      int choice = stdIn.nextInt();

      if (choice == 1) { // 求和
         int[][] arrC = new int[arrA.length][arrA[0].length];
         arrC = matrixSum(arrA, arrB);
         System.out.println("Sum matrix: ");
         printArray(arrC);
      }
      else { // 求积
        int[][] arrC = new int[arrA.length][arrB[0].length];
        arrC = matrixProduct(arrA, arrB);
        System.out.println("Product matrix: ");
        printArray(arrC);
      }

   }

   /*******************************************************/
   /* 求和方法                             */
   public static int[][] matrixSum(int[][] arr1, int[][] arr2) {

      int[][] arrSum = new int[arr1.length][arr1[0].length];

      if ( (arr1.length != arr2.length) 
           || (arr1[0].length != arr2[0].length) ) {
         System.err.println("Matrices are of incompatible size.");
         System.exit(1);
      }

      for (int row=0; row<arr1.length; row++) {
         for (int col=0; col<arr1[0].length; col++) {
            arrSum[row][col] = arr1[row][col] + arr2[row][col];
         }
      }
      
      return arrSum;

   }

   /*******************************************************/
   /* 求积方法                          */
   public static int[][] matrixProduct(int[][] arr1, int[][] arr2) {
     
      int[][] arrProduct = new int[arr1.length][arr2[0].length];

      if ( (arr1[0].length != arr2.length)) {
         System.err.println("Matrices are of incompatible size.");
         System.exit(1);
      }

      for (int row=0; row<arr1.length; row++) {
         for (int col=0; col<arr2[0].length; col++) {
            for (int i=0; i<arr1[0].length; i++)
              arrProduct[row][col] += arr1[row][i] * arr2[i][col];
         }
      }
      
      return arrProduct; 

   }

   /*******************************************************/
   /* 读入矩阵数据                      */
   public static int[][] readArray(Scanner scan, 
                                   int numRows, int numCols) {
     
      int[][] arr = new int[numRows][numCols];
    
      System.out.println("Enter values for " + numRows + "x" + numCols + " matrix:");
    
      for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[0].length; col++) {
          arr[row][col] = scan.nextInt();
        }
      }
      
      return arr;
   }

   /*******************************************************/
   /* 打印矩阵                               */
   public static void printArray(int[][] arr) {

      for (int row=0; row<arr.length; row++) {
         for (int col=0; col<arr[0].length; col++) {
            System.out.printf("%5d", arr[row][col]);
         }
         System.out.println();
      }

   } 

}
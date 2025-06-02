package com.medium.quesitons;

public class Searcha2DMatrix74 {
	
	
	
	
	
	 public static boolean searchMatrix2(int[][] matrix, int target) {
		        
		        int row = 0; int col = matrix[0].length-1;
		        while(row<matrix.length && col >= 0){
		            if(matrix[row][col] == target ) return true;
		            if(matrix[row][col] > target) col--;
		            else row++;
		        }

		        return false;
	  }
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0; int high = m*n -1;
        while(high>= low) {
        	int mid = low + (high- low)/2;
        	int mR = mid / m;
        	int mC = mid % m;
        	if(matrix[mR][mC] == target) {
        		return true;
        	}
        	
        	
        	if(matrix[mR][mC]>target) {
        		high = mid -1;
        	}else {
        		low = mid +1;
        	}
        }
		
		
		return false;
    }
	
	
	

	public static void main(String[] args) {
		int arr[][] = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		
		System.out.println(searchMatrix2(arr, 2));

	}

}

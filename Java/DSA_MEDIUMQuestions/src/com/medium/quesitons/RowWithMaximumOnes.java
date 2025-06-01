package com.medium.quesitons;

public class RowWithMaximumOnes {

	static int binarySearch(int arr[]){
		int ans = 0;
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(1<=arr[mid]) {
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
		ans = arr.length - low;
		return ans;
	}

	static public int rowWithMax1s(int[][] mat) {
		int idx = -1;
		int maxCount = 0;
		for(int i = 0 ;i < mat.length; i++) {
			if(binarySearch(mat[i])>maxCount) {
				idx = i;
				maxCount = binarySearch(mat[i]);
			}
		}
		
		return idx;
	}


	public static void main(String[] args) {

		int arr[][] = new int[][] {{0,0,0},{0,0,0},{0,0,0}};

		System.out.println(rowWithMax1s(arr));

	}
}

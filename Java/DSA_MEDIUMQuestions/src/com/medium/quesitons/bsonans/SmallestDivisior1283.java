package com.medium.quesitons.bsonans;

public class SmallestDivisior1283 {
	
	 public static int maxEle(int arr[]) {
		 int max = Integer.MIN_VALUE;
		 for(int i =0;i<arr.length;i++) {
			 max = Integer.max(arr[i],max);
		 }
		 
		 
		 return max;
	 }
	 
	 public static int sumOfQuotent(int arr[], int divisor) {
		 int sum = 0;
		 for(int ele: arr) {
			 sum = sum + (ele + divisor -1)/divisor;
		 }
		 
		 return sum;
	 }
	
	 public static int smallestDivisor(int[] nums, int threshold) {
		 int left = 1;
		 int right = maxEle(nums);
		 while(right >= left) {
			 int mid = left + (right-left)/2;
			 int sum = sumOfQuotent(nums, mid);
			 if(sum<=threshold) {
				 right = mid -1;
			 }else {
				 left = mid +1;
			 }
		 }
	     return left;
	 }
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {44,22,33,11,1};
		System.out.println(smallestDivisor(arr, 20));

	}

}

package com.medium.quesitons.bsonans;

public class KokoBanana {
	
	public static int highest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max = Math.max(arr[i], max);
		}
		
		return max;
	}
	
	public static int calculateTotalHours(int arr[], int hourly) {
		int totalHours = 0;
		for(int i = 0; i < arr.length ; i++) {
			totalHours = totalHours + (arr[i]+ hourly-1)/hourly;
		}
		
		return totalHours;
	}
	
	public static int minBananaPerHour(int arr[],int timeLimit) {
		int low = 1;
		int high = highest(arr);
		while(high>=low) {
			int mid = low + (high - low)/2;
			int totalHours = calculateTotalHours(arr, mid);
			
			if(totalHours > timeLimit) {
				low = mid +1;
			}else {
				high= mid -1;
			}
		}
		
		return low;
	}

	
	public static void main(String[] args) {
		int arr[]= new int[] {5, 5, 5, 5};
		System.out.println(minBananaPerHour(arr, 8));
	}

}

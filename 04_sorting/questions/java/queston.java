package com.questons.easy;

import java.util.Arrays;

public class Question1 {
	
	public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        
        return nums.length;
    }
	public static int missingNumberOptimal(int[] nums) {
        
		int actualSum = 0;
				for(int num: nums) {
					actualSum += num;
				}
		return (nums.length * (nums.length)/2) - actualSum;
    }
	
	
	
	public static int longestSubarrayWithSum(int[] nums, int k) {
		int i = 0;
		int sum = 0;
		int maxLength = 0;
		for(int j =0;j<nums.length;j++) {
			sum = sum + nums[j];
		
			while(sum> k && i<=j) {
				sum -= nums[i];
				i++;
			}
			
			if(sum == k) {
				maxLength = Math.max(maxLength, j-i+1);
			}
		}
		return maxLength;
	}

	public static int longestSubarrayWithSum(int[] nums, int k) {
		int i = 0;
		int sum = 0;
		int maxLength = 0;
		int count =null;
		for(int j =0;j<nums.length;j++) {
			sum = sum + nums[j];
			count++;
			while(sum> k && i<=j) {
				sum -= nums[i];
				i++;
				count--;
			}
			
			if(sum == k) {
				maxLength = Math.max(maxLength, j-i+1);
			}
		}
		return maxLength;
	}
	
	
	public static void main(String[] args) {

		int arr[] = {-1, 1, 1};
		
		System.out.println(longestSubarrayWithSum(arr, 1));
		
		
		
	}

}

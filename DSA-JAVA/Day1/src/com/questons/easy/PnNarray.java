package com.questons.easy;

import java.util.Arrays;

public class PnNarray {
	
	public int longestConsecutive(int[] nums) {
        
		
		return 0;
    }
	
	public static void reverse(int nums[], int start, int end) {
		while(start<end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void nextPermutation(int[] nums) {
		int i = nums.length -1;
		int dropIndex = -1;
		while(i>0) {
			if(nums[i]>nums[i-1]) {
				dropIndex = i-1;
				break;
			}
			i--;
		}
		int j = nums.length -1;
		while(j>dropIndex){
			if(dropIndex<0) {
				break;
			}
			if(nums[j]>nums[dropIndex]) {
				int temp = nums[j];
				nums[j] = nums[dropIndex];
				nums[dropIndex] = temp;
				
				break;
			}
			j--;
		}
		System.out.println(dropIndex);
		reverse(nums, dropIndex+1, nums.length-1);
		
    }

	public static int[] rearrangeArray(int[] nums) {
        int length = nums.length/2;
		int positive[] = new int[length];
		int negative[] = new int[length];
		int p = 0;
		int n = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				positive[p++] = nums[i];
			}else {
				negative[n++] = nums[i];
			}
		}
		p=0;
		for(int i = 0;i<length;i++) {
			nums[p++] = positive[i];
			nums[p++] = negative[i];
		}
		
		return nums;
    }
	
	public static void main(String[] args) {
//		int arr[] = new int[] {3,1,-2,-5,2,-4};
//		System.out.println(Arrays.toString(arr));
//		rearrangeArray(arr);
//		System.out.println(Arrays.toString(arr));
		int per[] = new int[] {3,2,1};
		System.out.println(Arrays.toString(per));
		nextPermutation(per);
		System.out.println(Arrays.toString(per));
		
		
	}

}

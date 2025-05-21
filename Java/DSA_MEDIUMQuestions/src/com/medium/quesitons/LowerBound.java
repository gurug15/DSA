package com.medium.quesitons;

import java.util.Arrays;

public class LowerBound {
	
	
	public static int[] searchRange(int[] nums, int target) {
        if(nums.length < 1) return new int[]{-1,-1};
        int end  = nums.length -1;
        int start = 0;
        while(end>=start) {
        	int mid = start + (end - start)/2;
        	if(nums[mid]>=target) {
        		end = mid - 1;
        	}else {
        		start  = mid +1;
        	}
        }
        if(start>=nums.length || nums[start] != target) start = -1;
        int newStart = 0;
        end = nums.length -1;
        while(end>=newStart) {
        	int mid = newStart + (end - start)/2;
        	if(nums[mid]>target) {
        		end = mid - 1;
        	}else {
        		newStart  = mid +1;
        	}
        }
        
        
        if(end<0|| nums[end] != target) end = -1;
        
        return new int[] {start,end};
    }
	
	 public static int lowerBound(int[] nums, int x) {
		 int s = 0;
	       int e = nums.length-1;
	       int mid =0;
	       while(e>=s){
	        mid = s + (e-s)/2;
	        //if(nums[mid] == x) return mid;
	        if(nums[mid]>=x) {
	            e = mid -1;
	        }else
	        { 
	        s = mid +1;
	        }
	     }

	     return s;
	 }
	 
	 public static int[] floorNceil(int[] nums, int x) {
		 int s = 0;
	       int e = nums.length-1;
	       int mid =0;
	       while(e>=s){
	        mid = s + (e-s)/2;
	        if(nums[mid]>=x) {
	            e = mid -1;
	        }else
	        { 
	        s = mid +1;
	        }
	     }
	     if(nums[s] == x) return new int[] {nums[s],nums[s]};
	     return new int[] {nums[e],nums[s]};
	 }
	 
	 
	 
	 public static int upperBound(int[] nums, int x) {
		 int s =0;
		 int e = nums.length -1;
		 while(e>=s) {
			 int mid = s + (e - s)/2;
			 if(nums[mid]<=x) {
				 s = mid + 1;
			 }else {
				 e = mid - 1;
			 }
		 }
		 
		 return s;
	 }
	
	public static void main(String[] args) {
		int arr[] = new int[] {5,7,7,8,8,10};
		System.out.println(lowerBound(arr, 8));
		System.out.println(upperBound(arr, 8));
		int arr2[] =  searchRange(arr, 1);
		for(int ele: arr2) {
			System.out.println(ele);
		}
		
	}

}

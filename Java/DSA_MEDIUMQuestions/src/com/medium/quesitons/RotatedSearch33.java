package com.medium.quesitons;

public class RotatedSearch33 {
	
	
	
	public static int binarySearch(int[] nums, int left, int right, int target) {
		int l = left;
		int r = right;
		while(r>=l) {
			int mid = l + (r-l)/2;
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[mid]>target) {
				r = mid - 1;
			}else if(nums[mid]<target) {
				l = mid+1;
			}
		}
		
		
		return -1;
	}
	
	public static int findDrop(int []nums) {
		int left = 0;
        int right = nums.length -1;
        int mid = left + (right - left)/2;
        while(mid >= left) {
        	if(left == mid) {
        		return mid;
        	}
        	
        	if(nums[mid]> nums[right]) {
        		left = mid;
        		mid = left + (right - left)/2;
        	}else {
        		mid = left + (mid - left)/2;
        	}
        }
        
        
        return 0;
	}
	
	public static int search(int[] nums, int target) {
		if(nums.length == 1) {
			return nums[0] == target ? 0 : -1;
		}
        if(nums[0]>nums[nums.length-1]) {
        	int drop = findDrop(nums);
        	if(target == nums[drop]) {
        		return drop;
        	}
        	
        	if(!(nums[nums.length-1]<target)) {
        		return binarySearch(nums,drop+1,nums.length-1, target);
        	}
        	
        	return binarySearch(nums, 0, drop, target);
        }
		
		return binarySearch(nums, 0, nums.length-1, target);
    }
	
	public static int searchOptimal(int[] nums, int target) {
			if(nums.length == 1) {
				return nums[0] == target ? 0 : -1;
			}
			
			int low = 0 , high = nums.length-1;
			while(high>=low) {
				int mid = low + (high-low)/2;
				if(nums[mid] == target) {
					return mid;
				}
				
				if(nums[low]<nums[mid]) {
					if(nums[low]<= target && nums[mid] >= target) {
						high = mid -1;
					}else {
						low = mid +1;
					}
				}else {
					if(nums[mid]<target && nums[high]>=target) {
						low = mid + 1;
					}else{
						high = mid - 1;
					}
				}
			}
			
			return -1;
    }
	
	
	
	public static void main(String[] args) {
		int arr[] = new int[] {3,5,1};
		System.out.println("drop index: "+  findDrop(arr));
		System.out.println("num at index : " +search(arr, 1));
		System.out.println("num at index Optimal : " +searchOptimal(arr, 1));

	}

}

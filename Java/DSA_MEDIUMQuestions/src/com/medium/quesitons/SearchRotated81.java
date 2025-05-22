package com.medium.quesitons;

public class SearchRotated81 {
	
	
	
	public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length -1;
        while(high >= low) {
        	int mid = low + (high - low)/2;
        	min = Integer.min(min,nums[mid]); 
        	if(nums[low]>=nums[mid]) {
        		min = Integer.min(min, nums[high]);
        		high= mid -1;
        	}else {
        		min = Integer.min(min, nums[low]);
        		low = mid + 1;
        	}
        	
        }
    
        return min;
	}
	
	
	public boolean search(int[] nums, int target) {
        int high = nums.length -1;
        int low = 0;
        while(high>=low){
            int mid = low + (high - low)/2;
            
            if(nums[mid] == target){
                return true;
            }
            
            if( nums[mid] == nums[low] && nums[low] == nums[high]) {
            	low++; high--;
            	continue;
            }

            
            if(nums[mid]>=nums[low]){
                if(nums[low]<=target && nums[mid]>=target){
                    high = mid - 1;
                }else {
                	low= mid + 1;
                }
            }else {
            	if(nums[high]>=target && nums[mid]<=target) {
            		low = mid + 1;
            	}else {
            		high = mid - 1;
            	}
            }
        }
        
        return false;
    }
	
	
	public static void main(String[] args) {
		SearchRotated81 sr = new SearchRotated81();
		int arr[] = new int[] {7,1,2,3,4,5,6};
		//System.out.println(sr.search(arr, 0));
		System.out.println(sr.findMin(arr));
	}

}

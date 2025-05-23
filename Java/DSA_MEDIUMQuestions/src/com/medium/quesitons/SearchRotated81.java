package com.medium.quesitons;

public class SearchRotated81 {
	
	
	
	
	
	
	
	public int findSingleBrute(int []nums) {
		int left = 0;
		int right = nums.length -1;
		while(left<=right) {
			if(nums[left] != nums[left +1]) return nums[left];
			if(nums[right] != nums[right-1]) return nums[right];
			
			left+=2;
			right-=2;
		}
		
		return -1;
		}
	
	public int findSingle(int []nums) {
		if(nums.length == 1) return nums[0];
		int left = 1;
		int right = nums.length -2;
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(nums[mid] != nums[mid +1] && nums[mid]!=nums[mid-1]) {
				return nums[mid];
			}
			if(mid%2==0 && nums[mid] == nums[mid +1] || mid%2==1 && nums[mid] == nums[mid -1]) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
		}
		
		return -1;
		}
	
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
//		int arr[] = new int[] {7,1,2,3,4,5,6};
//		//System.out.println(sr.search(arr, 0));
//		System.out.println(sr.findMin(arr));
		int twice[] = new int[] {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,9,9,10,10};
		long start = System.currentTimeMillis();
		System.out.println(sr.findSingle(twice));
		System.out.println("Optimal: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		System.out.println(sr.findSingleBrute(twice));
		System.out.println("Brute: "+ (System.currentTimeMillis() - start));

	}

}

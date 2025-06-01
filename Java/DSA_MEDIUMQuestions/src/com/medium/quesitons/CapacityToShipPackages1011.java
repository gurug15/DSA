package com.medium.quesitons;



public class CapacityToShipPackages1011 {
	
	
	public int totalSum(int[] weights){
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum = sum + weights[i];
        }

        return sum;
    } 
    

    public int MaxElement(int[] arr) {
    	int max = Integer.MIN_VALUE;
    	for(int num:arr) {
    		max = Integer.max(max, num);
    	}
    	
    	return max;
    }
    
    int findDays(int[]arr,int cap) {
    	int days = 1, load = 0;
    	for(int i =0; i<arr.length;i++) {
    		if(arr[i]+load > cap) {//1,2,3,4,5,6,7,8,9,10
    			days++;
    			load = arr[i];
    		}else {
    			load = load + arr[i];
    		}
    	}
    	
    	return days;
    }

    public int shipWithinDays(int[] weights, int days) {
    	
    	int low = MaxElement(weights);
    	int high = totalSum(weights);
    	
    	while(high>=low) {
    		int mid = low + (high-low)/2;
    		if(findDays(weights,mid)>days) {
    			low = mid + 1;
    		}else {
    			high  = mid -1;
    		}
    	
    	}
    	
    	
    	return low;
    }
    
   
    
    public static void main(String[] args) {
    	
    	
	}
	
	
}

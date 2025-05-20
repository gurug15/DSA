package com.medium.quesitons;

import java.util.HashMap;
import java.util.Map;

public class Xorsubarray {
	 
	public static int subarraysWithXorK(int[] nums, int k) {
	      int preXor = 0;
	      int count = 0;
	      Map<Integer, Integer> firstXOr = new HashMap<Integer, Integer>();
	      firstXOr.put(0, 1);
	      for(int i = 0; i<nums.length; i++) {
	    	  preXor = preXor ^ nums[i];
	    	  
	    	  if(firstXOr.containsKey(preXor ^ k)) {
	    		  count = count + firstXOr.get(preXor ^ k);
	    	  }
	    	  
	    	  
	    	  firstXOr.put(preXor,firstXOr.getOrDefault(preXor, 0) +1);
	      }
		
	      for(Map.Entry<Integer, Integer> entry : firstXOr.entrySet()) {
	    	  System.out.println(entry.getKey() + "->" + entry.getValue());
	      }
		return count;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {4,2,2,6,4};
		System.out.println(subarraysWithXorK(arr, 6));
 
	}

}

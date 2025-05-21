package com.medium.quesitons;

import java.util.Arrays;

public class RepetingMissiong {

	public static int[] findMissingRepeatingNumbers(int[] nums) {
		int hash[] = new int[nums.length];
		
		for(int i = 0 ; i< nums.length ; i++) {
			hash[nums[i]-1]++;
		}
		
		int A = 0;
		int B = 0;
		
		for(int i = 0; i< hash.length ; i++) {
			if(hash[i]>1) {
				A = i+1;
			}
			if(hash[i]==0) {
				
				B = i+1;
			}
		}
		return new int[]{A , B};
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findMissingRepeatingNumbers(new int[] {1, 2, 3, 6, 7, 5, 7})));

	}

}

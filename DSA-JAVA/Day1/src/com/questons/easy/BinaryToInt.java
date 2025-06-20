package com.questons.easy;





 

public class BinaryToInt {
	 public static int getDecimalValue(int arr[]) {
	        Solution sol = new Solution();
	        
	        
	        System.out.println(sol.m);
	        sol.insertionNewArray(arr);
	        int sum = 0;
	        ListNode newHead = sol.reverse(sol.head);
	        int count = 0;
	        while(newHead != null) {
	        	sum = sum + newHead.val * (int)Math.pow(2, count++);
	        	newHead = newHead.next;
	        }
	        
	        return sum;
	    }
	public static void main(String[] args) {
			int arr[] = new int[] {1,0,1,0,0,1};
			System.out.println(Math.pow(2, 3));
			System.out.println(getDecimalValue(arr));
	}

}

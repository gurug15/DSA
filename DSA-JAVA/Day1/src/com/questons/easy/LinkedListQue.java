package com.questons.easy;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
		ListNode head;
		ListNode tail;
		
		public Solution() {
			head = null;
			tail = null;
		}
		private void insert(int val) {
			ListNode node = new ListNode(val);
			if(head == null) {
				head = node;
				tail = node;
				
				return;
			}
			
			tail.next = node;
			tail = node;
		}
		
		public void display() {
			ListNode cur = head;
			while(cur!=null){
				System.out.print(cur.val+ " ");
				cur = cur.next;
			}
		}
	
		public void insertionNewArray(int[] arr) {
			head = null;
			for(int i = 0;i<arr.length;i++) {
				insert(arr[i]);
			}
		}
		
		
		public ListNode reverse(ListNode from) {
			ListNode prev = null;
			ListNode curr = from;
			while(curr != null ) {
				ListNode next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			
			return prev;
		}
		
		private ListNode midEle() {
			ListNode last = head;
	        ListNode mid = head;
	        while(last != null && last.next != null && last.next.next != null) {
	        	mid = mid.next;
	        	last = last.next.next;
	        }
	        System.out.println("\nMid val  " +mid.val);
	    	
	        return mid;
		}
		
	    public boolean isPalindromeQue234() {
	        ListNode mid = midEle();
	        ListNode fromMid = mid.next;
	    	fromMid = reverse(fromMid);
	    	ListNode current = head;
	    	while(fromMid != null) {
	    		if(current.val != fromMid.val) {
	    			return false;
	    		}
	    		current = current.next;
	    		fromMid = fromMid.next;
	    	}
	        return true;
	    }
	    
	    public static void main(String[] args) {
	    	int arr[] = new int[] {1,2,3,2,1};
	    	Solution sol = new Solution();
	    	sol.insertionNewArray(arr);
	    	//sol.display();
	    	System.out.println(sol.midEle().val);
			sol.display();
		}
}


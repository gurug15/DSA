package com.questions.mid;

import java.util.Stack;

public abstract class A{
	
	public static int maxDepth(String s) {
   
      int count  = 0;
      int maxCount = -1;
      for(char c : s.toCharArray()) {
    	  
    	  if(c == '(') {
    		  count++;
    	  }
    	  
    	  if(c == ')') {
    		  count--;
    	  }
    	  
    	  maxCount = Math.max(maxCount, count);
      }
      
      return maxCount;
    }
	
	public static void main(String[] args) {
		System.out.println(maxDepth("()(()))))))))"));
	}
}

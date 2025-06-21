package com.question.one;

import java.util.HashMap;
import java.util.Map;

import com.question.one.entity.LinkedList;
import com.question.one.entity.List;
import com.question.one.entity.Queue;
import com.question.one.entity.QueueList;

public class Main {
	
	
	 
	
	 public static boolean rotateString(String s, String goal) {
		 if(s.length() != goal.length()) return false;
		
		 
		 for(int j=goal.length()-1;j>=0;j--) {
			 if(goal.charAt(j)==s.charAt(0)) {
				 boolean flag = true;
				 for(int i=0;i<s.length();i++) {
					 if(s.charAt(i)!=goal.charAt((i+j)% goal.length())){
						 flag = false;
						 break;
					 }
				 }
				 if(flag) return flag;
			 }
		 }
		
		 
		 return false;
	 }
	
	 
	 public static boolean isAnagram(String s, String t) {
		 if(s.length() != t.length()) return false;
		 HashMap<Character, Integer> first = new HashMap<Character, Integer>();
		 HashMap<Character, Integer> second = new HashMap<Character, Integer>();
		 
		 for(int i=0;i<s.length();i++) {
			 first.put(s.charAt(i), first.getOrDefault(s.charAt(i), 0)+1);
			 second.put(t.charAt(i), second.getOrDefault(t.charAt(i), 0)+1);
		 }
		 
		 for(Map.Entry<Character, Integer> entry: first.entrySet()) {
			 if(!(second.containsKey(entry.getKey()) && first.get(entry.getKey()) ==second.get(entry.getKey()))){
				 return false;
			 }
		 }
		 
		 return true;
	 }
	

	public static void main(String[] args) {
		
		//System.out.println(rotateString("defdefdefabcabc", "defdefabcabcdef"));
		System.out.println(isAnagram("abcsea", "abcsaa"));
	}

}

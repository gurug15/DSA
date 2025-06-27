package com.questions.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseWords {
	
	public class CharCount{
		public Integer count;
		public Character c;
		
		
	
		public CharCount(Integer count, Character c) {
			super();
			this.count = count;
			this.c = c;
		}



		@Override
		public String toString() {
			return " " + count + " "+ c;
		}
	}			
	
	public String frequencySort(String s) {
        int arr[] = new int[130];
        for(int i=0;i<s.length();i++) {
        	arr[s.charAt(i)]++;
        }
      
        
        List<CharCount> charList = new ArrayList<ReverseWords.CharCount>();
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] !=0) {
            	CharCount count  =  new CharCount(arr[i], (char)i);
            	charList.add(count);
        	}
        }
        Collections.sort(charList,(o1,o2)->o2.count.compareTo(o1.count));
        System.out.println(charList);
        StringBuilder sb = new StringBuilder();
        for(CharCount c: charList) {
        	int count = c.count;
        	while(count>0) {
        		sb.append(c.c);
        		count--;
        	}
        }
        
        return sb.toString();
    }
	
	public void reverse(String[] words) {
		int start = 0;
		int end = words.length -1;
		
		while(end>start) {
			String tempWord = words[start];
			words[start] = words[end];
			words[end] = tempWord;
			start++;
			end--;
		}
		
	}
	
	public String reverseWords(String s) {
        
		String []words = s.trim().replaceAll("\\s+", " ").split(" ");
		reverse(words);
		StringBuilder ans = new StringBuilder("");
		for(String word : words) {
			ans.append(word + " ");
		}
		ans.deleteCharAt(ans.length()-1);
		return ans.toString();
    }

	public boolean isIsomorphic(String s, String t) { //egg foo
		 if (s.length() != t.length()) return false;

		    HashMap<Character, Character> mapST = new HashMap<>();
		    HashMap<Character, Character> mapTS = new HashMap<>();

		    for (int i = 0; i < s.length(); i++) {
		        char c1 = s.charAt(i);
		        char c2 = t.charAt(i);

		        if (mapST.containsKey(c1)) {
		            if (mapST.get(c1) != c2) return false;
		        } else {
		            mapST.put(c1, c2);
		        }

		        // Check reverse mapping
		        if (mapTS.containsKey(c2)) {
		            if (mapTS.get(c2) != c1) return false;
		        } else {
		            mapTS.put(c2, c1);
		        }
		    }

		    return true;	
    }
	
	
	public String largestOddNumber(String num) {
      
		for(int i = num.length()-1; i>=0;i--) {
			if((int)num.charAt(i) % 2 == 1) {
				return num;
			}
			
			num = num.substring(0, i);
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		ReverseWords rv = new ReverseWords();
		System.out.println(rv.frequencySort("tree"));
	}

}

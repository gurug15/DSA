package com.questions.mid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseWords {
	
	public String frequencySort(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        
        for(int i=0;i<s.length();i++){        
        }
        int max = 0;
        for(Map.Entry<Character, Integer> entry: mpp.entrySet()) {
        	max = Math.max(max, entry.getValue());
        }
        char []letters = new char[max +1];
        for(Map.Entry<Character, Integer> entry: mpp.entrySet()) {
        	letters[entry.getValue()] = entry.getKey(); 
        }
        
        return "hello";
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
		ReverseWords rw = new ReverseWords();
		System.out.println(rw.isIsomorphic("badc", "baba"));
		//System.out.println(rw.largestOddNumber("220"));
	}

}

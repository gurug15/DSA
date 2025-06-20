package com.test2;

import java.sql.Connection;

import com.test.BaseClass;

public class Classtwo {
	
	 String removeOuterParentheses(String s) {
        String result = null;  
        int balance = 0; 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (balance > 0) {
                    result += s.charAt(i);
                }
                balance++; 
            } else {
                balance--; 
                if (balance > 0) {
                    result += s.charAt(i);
                }
            }
        }

        return result;
    }
	
	public static void main(String[] args) {
		Connection i;

		try {
			System.out.println(i);
		} catch (Exception e) {
		
		
		}
	}
	
}

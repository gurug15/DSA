package com.questions.mid;

import java.sql.Date;

public class VerifyE  extends A{

	 public static void main(String[] args) throws ClassNotFoundException {
	        ClassLoader cl = VerifyE.class.getClassLoader();
	        System.out.println("MyLoaderTest loaded by: " + cl);

	        Class<?> stringClass = String.class;
	        System.out.println("String class loaded by: " + stringClass.getClassLoader());

	        Class<?> mathClass = Math.class;
	        System.out.println("Math class loaded by: " + mathClass.getClassLoader());

	        ClassLoader custom = Date.class.getClassLoader();
	        System.out.println("MyCustomClass loaded by: " + custom);
	        
	        
	    }

}

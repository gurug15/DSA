package com.question.one;


class Base {
	void test() {
		System.out.println("test base");
	}
}



public class MCQuestions extends Base {
	
	@Override
	 void test() {
		System.out.println("test MCQ");
	}
	
	public static void test2() {
		System.out.println("test asd");
	}
	public static void main(String[] args) {
		System.out.println("main");
		test2();
	}
}

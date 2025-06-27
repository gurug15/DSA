package com.questions.mid;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
	private String name;
	private String addr;
	private int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	
}




public class JvmArchi {

	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(Student.class);
//	 Class<?> c = Class.forName("com.questions.mid.Student");
//	 
//	 Method[] methods = c.getDeclaredMethods();
//	 Field[] fields = c.getDeclaredFields();
//	 
//	 for(Method m:methods) {
//		 System.out.println(m);
//	 }
//	 for(Field f:fields) {
//		 System.out.println(f);
//	 }
		
		Student s1 = new Student();
		Class<?> c = s1.getClass();
		Student s2 = new Student();
		Class<?> c2 = s2.getClass();
		
		System.out.println(s1 == s2);

		System.out.println(c == c2);

		System.out.println(c.hashCode()+ " "+ c2.hashCode());
		
		
	}

}

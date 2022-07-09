package com.sample;

public class SampleTest {
public static void main(String[] args) {
	String s = "Java Selenium Testing";
	int length = s.length();
	System.out.println(length);
	
	int indexOf = s.indexOf('S');
	System.out.println(indexOf);
	
	
	boolean contains = s.contains("ava");
	System.out.println(contains);
	
	int lastIndexOf = s.lastIndexOf("e");
	System.out.println(lastIndexOf);
	
	char charAt = s.charAt(3);
	System.out.println(charAt);
	
	boolean equals = s.equals("Java Selenium Testing");
	System.out.println(equals);
	
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("JaVa Seenium Testing");
	System.out.println(equalsIgnoreCase);
	
  int compareTo = s.compareTo("Lakshmi");
	System.out.println(compareTo);
	
	
	System.out.println("Harish");
	System.out.println("Lakshmi narayanan");
	System.out.println("Welcome Back");

}
}

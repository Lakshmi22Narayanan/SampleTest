package com.sample;

import java.util.Enumeration;
import java.util.Vector;

public class SampleTest2 {
	public static void main(String[] args) {
String s = "Java";
String s1 = "Java";
String s2 = "Java";
String s3 = "Java";
String s4 = "Selenium";

int identityHashCode = System.identityHashCode(s);
System.out.println("s = "+identityHashCode);
System.out.println("s1 = "+System.identityHashCode(s1));
System.out.println("s2 = "+System.identityHashCode(s2));
System.out.println("s3 = "+System.identityHashCode(s3));
System.out.println("s4 = "+System.identityHashCode(s4));

String concat = s.concat(s4);
System.out.println("Concat = "+concat);

System.out.println("concatination = "+System.identityHashCode(concat));


String concat1 = s4.concat(s);

System.out.println("concatination1 = "+System.identityHashCode(concat1));

System.out.println("=============================================================");
String a = new String ("java");
String a1 = new String ("Welcome");
String a2 = new String ("Welcome");
String a3 = new String ("Welcome");

System.out.println("a = "+System.identityHashCode(a));
System.out.println("a1 = "+System.identityHashCode(a1));
System.out.println("a2 = "+System.identityHashCode(a2));
System.out.println("a3 = "+System.identityHashCode(a3));

String concat2 = a.concat(a1);
String concat3 = a1.concat(a);

System.out.println("concat2 = "+System.identityHashCode(concat2));
System.out.println("concat3 = "+System.identityHashCode(concat3));

System.out.println(concat3);

System.out.println("====================================================================");

StringBuilder d = new StringBuilder("Java");
StringBuilder d1 = new StringBuilder("Welcome");

System.out.println("s Literal = "+identityHashCode);
System.out.println("a nonLiteral = "+System.identityHashCode(a));
System.out.println("d builder = "+System.identityHashCode(d));
System.out.println("d1 builder = "+System.identityHashCode(d1));


StringBuffer e = new StringBuffer("Java");
StringBuffer e1 = new StringBuffer("Welcome");
System.out.println("e buffer = "+System.identityHashCode(e));
System.out.println("e1 buffer = "+System.identityHashCode(e1));

StringBuilder append = d.append(d1);
System.out.println(append);
System.out.println("Append d to d1 = "+System.identityHashCode(append));


StringBuilder append2 = d1.append(d);
System.out.println("append d1 to d = "+System.identityHashCode(append2));

StringBuffer append3 = e.append(e1);
System.out.println("append e to e1 = "+System.identityHashCode(append3));


System.out.println("welcome");
System.out.println("Java Selenium");

System.out.println("sam");	}

	}

}
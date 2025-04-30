package com.interview;

public class FindlarLet {
    public static void main(String[] args) {

	String s1 = "Hi";
	String s2 = "Hello";
	System.out.println("Before Swap : " + s1 + " : " + s2);
	s1 = s1 + s2;
	s2 = s1.replace(s2, "");
	s1 = s1.replace(s2, "");
//	s2 = s1.substring(0, s1.length() - s2.length());
//	s1 = s1.substring(s2.length());
	System.out.println("After Swap : " + s1 + " : " + s2);

	int value1 = 10;
	int value2 = 20;

	value1 = value1 + value2;
	value2 = value1 - value2;
	value1 = value1 - value2;
	System.out.println("After Swap :" + value1 + ":" + value2);
    }

}
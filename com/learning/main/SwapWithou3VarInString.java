package com.learning.main;

import java.util.Scanner;

public class SwapWithou3VarInString {

    public static void main(String[] args) {
	// swap 2 string without using 3 variable
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 2 Names:");
	String person1 = in.next();
	String person2 = in.next();

	swappingWithou3Variable(person1, person2);
    }

    private static void swappingWithou3Variable(String person1, String person2) {
	System.out.println("Before swapping :" + person1 + " || " + person2);
	person1 = person1 + person2;
	person2 = person1.replace(person2, "");
	person1 = person1.replace(person2, "");
	System.out.println("After swapping :" + person1 + " || " + person2);
    }
}

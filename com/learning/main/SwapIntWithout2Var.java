package com.learning.main;

import java.util.Scanner;

public class SwapIntWithout2Var {

    public static void main(String[] args) {
	// swap 2 integer without using 3 variable
	Scanner in = new Scanner(System.in);
	System.out.println("Enter any 2 numbers:");
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	swapWithout3VariableInInteger(num1, num2);
    }

    private static void swapWithout3VariableInInteger(int num1, int num2) {
	System.out.println("Before swap : " + num1 + "|" + num2);
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	System.out.println("After swap : " + num1 + "|" + num2);
    }
}

package com.learning.recursion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintNnumberUsing {

	public static void main(String[] args) {
	int n=5;
	System.out.println(findFactorial(n));
	System.out.println(findSumOfN(n));
	int digits=1324;
	System.out.println(sumOfDigits(digits));
	System.out.println(productOfDigits(digits));
	
	String name="Ms Dhoni";
	StringBuilder stringBuilder= new StringBuilder(name);
	System.out.println(stringBuilder.reverse().toString());
//	funPrint(n);
//	funPrintrev(n);
	int [] nums1= {1,3,5,7};
	int[] nums2= {2,4,6};
	List<Integer> collect = Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(collect);
	}

	private static int productOfDigits(int n) {
if(n==1) {
	return 1;
}
		return (n%10)*productOfDigits(n/10);
	}

	private static int sumOfDigits(int digits) {
		if(digits==0) 
		{
			return 0;
		}
		return (digits%10)+sumOfDigits(digits/10);
	//	return (for 1324 if we modlo it give end digit ) + sumOfDigits(132/10);
	}

	private static int findSumOfN(int n) {
		if(n==1) {
			return 1;
		}
		return n + findSumOfN(n-1);
	}

	private static int findFactorial(int n) {
		if(n==1) {
			return 1;
		}
		return n * findFactorial(n-1);
	}

	private static void funPrintrev(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		funPrintrev(n-1);
		System.out.println(n);
	}

	private static void funPrint(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		funPrint(n-1);
	}

}

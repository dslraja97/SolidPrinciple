package com.learning.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringBasedProblem {

	public static void main(String[] args) {
	String [] input= {"Zaheer","Hussian","Dinesh","Azar","AAkash"};
	
	List<String> collect = Arrays.stream(input).distinct().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.reverseOrder())).collect(Collectors.toList());
	System.out.println(collect);
	}

}

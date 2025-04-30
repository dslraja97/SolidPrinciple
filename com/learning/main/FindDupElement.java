package com.learning.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDupElement {

    public static void main(String[] args) {
	int[] nums = { 1, 2, 2, 5, 8, 9, 9, 14, 14, 2, 8, 15 };
	List<Integer> collect = Arrays.stream(nums).boxed()
		.collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream()
		.filter(n -> n.getValue() > 1).map(n -> n.getKey()).collect(Collectors.toList());

	System.out.println(collect);
    }
}

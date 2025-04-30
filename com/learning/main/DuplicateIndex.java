package com.learning.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateIndex {

    public static void main(String[] args) {
	int[] nums = { 1, 2, 3, 7, 3, 5, 7, 2, 1, 9, 8, 3 };

	findDuplicateIndexUsingTraditionalApproach(nums);
	findDuplicateIndexUsingStreamApproach(nums);
    }

    private static void findDuplicateIndexUsingTraditionalApproach(int[] nums) {
	System.out.println("Using Traditional Approach");
	Map<Integer, List<Integer>> resultMap = new HashMap<>();
	for (int i = 0; i <= nums.length - 1; i++) {
	    resultMap.putIfAbsent(nums[i], new ArrayList<Integer>());
	    resultMap.get(nums[i]).add(i);
	}

	for (Map.Entry<Integer, List<Integer>> entry : resultMap.entrySet()) {
	    if (entry.getValue().size() > 1) {
		System.out.println(entry.getKey() + "->" + entry.getValue());
	    }
	}
    }

    private static void findDuplicateIndexUsingStreamApproach(int[] nums) {
	System.out.println("Using Stream API Approach");
	Map<Integer, List<Integer>> indexMap = IntStream.range(0, nums.length).boxed()
		.collect(Collectors.groupingBy(i -> nums[i]));
	Map<Integer, List<Integer>> resultMap = indexMap.entrySet().stream()
		.filter(entry -> entry.getValue().size() > 1)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	resultMap.entrySet().stream().forEach(System.out::println);
    }

}

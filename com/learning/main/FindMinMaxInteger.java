package com.learning.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMaxInteger {

    public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(999999, 999999, 999999, 999999, 999999);
	Collections.sort(nums);
	int target = nums.get(nums.size() - 1);
	System.out.println(target);
	int count = 0;
	for (int i : nums) {
	    if (i == target) {
		count++;
	    }
	}
	System.out.println(count);
    }

}

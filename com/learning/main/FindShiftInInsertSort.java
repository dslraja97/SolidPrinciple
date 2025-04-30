package com.learning.main;

import java.util.Arrays;
import java.util.List;

public class FindShiftInInsertSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<Integer> nums = Arrays.asList(2, 1, 3, 1, 2);
	System.out.println(findShift(nums));
	quickSort(nums);

    }

    private static void quickSort(List<Integer> nums) {
	// TODO Auto-generated method stub\
//	String s = null;
//	System.out.println(s.trim());
    }

    private static int findShift(List<Integer> nums) {
	int shift = 0;
	for (int i = 1; i < nums.size(); i++) {
	    int key = nums.get(i);
	    int j = i - 1;
	    while (j >= 0 && nums.get(j) > key) {
		nums.set(j + 1, nums.get(j));
		shift++;
		j = j - 1;
	    }

	    nums.set(j + 1, key);
	}
	return shift;
    }

}

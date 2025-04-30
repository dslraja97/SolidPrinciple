package in.dsa;

import java.util.Arrays;

public class BubbleSortUsingRecursion {

    public static void main(String[] args) {
	int[] nums = { 3, 1, 5, 8, 0 };
	bubbleSort(nums, nums.length - 1, 0);
	System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums, int end, int start) {
	if (end == 0) {
	    return;
	}
	if (end > start) {// end=4,s=0,s1
	    if (nums[start] > nums[start + 1]) {
		nums[start] = nums[start] + nums[start + 1];
		nums[start + 1] = nums[start] - nums[start + 1];
		nums[start] = nums[start] - nums[start + 1];
	    }
	    bubbleSort(nums, end, start + 1);
	} else {
	    bubbleSort(nums, end - 1, 0);
	}
    }

}

package in.dsa;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BinarySearch {

    public static void main(String[] args) {
	int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
	int target = 1;
	int result = binarySearch(nums, target);
//	int result = findTargetUsingStreamAPI(nums, target);
	System.out.println(result >= 0 ? "Target Found!" : "Target Not Found!");
    }

    private static int binarySearch(int[] nums, int target) {
	int start = 0;
	int end = nums.length - 1;
	while (start <= end) {
	    int mid = start + (end - start) / 2;
	    if (target == nums[mid]) {
		return mid;
	    } else if (target > nums[mid]) {
		start = mid + 1;
	    } else {
		end = mid - 1;
	    }
	}
	return -1;
    }

    private static int findTargetUsingStreamAPI(int[] nums, int target) {
	OptionalInt findFirst = IntStream.range(0, nums.length).filter(i -> nums[i] == target).findFirst();
	if (findFirst.isPresent()) {
	    return findFirst.getAsInt();
	} else {
	    return -1;
	}
    }

}

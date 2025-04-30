package in.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practise {

    public static void main(String[] args) {

    }

    private static void duplicateIntegerOccurances(int[] nums) {
	Map<Integer, Long> collect = IntStream.range(0, nums.length).boxed()
		.collect(Collectors.groupingBy(n -> nums[n], Collectors.counting()));

	System.out.println(collect);
    }

    private static void searchInArrayUsingStreamAPI(int[] nums) {
	int target = 1;
	int targetIndex = IntStream.range(0, nums.length).filter(i -> nums[i] == target).findAny().orElse(-1);
	System.out.println(targetIndex >= 0 ? "Target Found! " + targetIndex : "Target Not Found!" + targetIndex);
    }

    private static int binarySearch(int target, int[] num) {
	int start = 0;
	int end = num.length - 1;
	while (start <= end) {
	    int mid = start + (end - start) / 2;
	    if (target == num[mid]) {
		return mid;
	    } else if (target > num[mid]) {
		start = mid + 1;
	    } else {
		end = mid - 1;
	    }
	}
	return -1;
    }

    private static void convertRomanToInteger(String input) {
	Map<Character, Integer> romanMap = new HashMap<>();
	romanMap.put('I', 1);
	romanMap.put('V', 5);
	romanMap.put('X', 10);
	romanMap.put('L', 50);
	romanMap.put('C', 100);
	romanMap.put('D', 500);
	romanMap.put('M', 1000);
	int total = 0;
	int prevValue = 0;

	for (int i = input.length() - 1; i >= 0; i--) {
	    int currentValue = romanMap.get(input.charAt(i));
	    if (currentValue < prevValue) {
		total -= currentValue;
	    } else {
		total += currentValue;
	    }
	    prevValue = currentValue;
	}
	System.out.println(total);
    }

    private static void findSpecificCharacterOccuranceInListOfString(List<String> names) {
	Map<String, Long> collect = names.stream()
		.collect(Collectors.toMap(name -> name, name -> name.chars().filter(n -> n == 'a').count()));
	System.out.println(collect);
    }

    private static void findFactorial(int n) {
	int fact = 1;
	for (int i = 1; i <= n; i++) {
	    fact *= i;
	}
	System.out.println("The factorial of the number " + n + " is " + fact);
    }

    private static void findTheCharacterCount(String name) {
	Map<Character, Long> collect = name.toLowerCase().chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	System.out.println(collect);
    }

    private static void reverseStringWithoutBuiltInFunction(String name) {
	char[] charArray = name.toCharArray();
	StringBuilder sb = new StringBuilder();
	for (int i = charArray.length - 1; i >= 0; i--) {
	    sb.append(charArray[i]);
	}
	System.out.println(sb.toString());
    }

    private static void findMaxSum(int[] nums) {
	int start = 0, end = 0, tempStart = 0, maxSum = nums[0], currentSum = nums[0];
	for (int i = 1; i < nums.length; i++) {
	    if (currentSum < 0) {
		currentSum = nums[0];
		tempStart = i;
	    } else {
		currentSum += nums[i];
	    }
	    if (currentSum > maxSum) {
		maxSum = currentSum;
		start = tempStart;
		end = i;
	    }

	}

	List<Integer> collect = Arrays.stream(nums, start, end + 1).boxed().collect(Collectors.toList());
	System.out.println(collect);
    }

}

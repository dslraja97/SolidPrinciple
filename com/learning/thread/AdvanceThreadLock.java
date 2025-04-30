package com.learning.thread;

public class AdvanceThreadLock {

    public static void main(String[] args) {
	String input = "Hello world wish you a very very happy happy new year happy!";
	String find = "happy";
	int count = findWordCount(input, find);
	System.out.println(count);
    }

    private static int findWordCount(String input, String find) {
	int count = 0;
	if (input == null || input.isEmpty()) {
	    return 0;
	}
	String[] wordArray = input.split("\\W+");

	for (String s : wordArray) {
	    if (s.equalsIgnoreCase(find)) {
		count++;
	    }
	}

	return count;
    }

}

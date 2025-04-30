package com.learning.main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindRepeatedCharacter {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String input = "Dineshkumar Saraswathi Raja suchithra";
//		reverserString(input);
//		maxRepeatLetter(input);
//		reverseVowelCharacter(input);

	Map<Character, Long> collect = input.toLowerCase().chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

	List<Entry<Character, Long>> collect2 = collect.entrySet().parallelStream().filter(c -> c.getValue() > 1)
		.collect(Collectors.toList());
	System.out.println(collect2);
    }

    private static void reverseVowelCharacter(String input) {
	List<Character> vowelQueue = new LinkedList<>();
	for (char ch : input.toLowerCase().toCharArray()) {
	    if (isVowel(ch)) {
		vowelQueue.add(ch);
	    }
	}

	char[] result = input.toCharArray();

	for (int i = 0; i < result.length; i++) {
	    if (isVowel(result[i])) {
		result[i] = vowelQueue.remove(vowelQueue.size() - 1);
	    }
	}

	String finalResult = new String(result);

	System.out.println(finalResult);
    }

    private static boolean isVowel(char ch) {
	ch = Character.toLowerCase(ch);
	if (Character.isLetter(ch)) {
	    ch = Character.toLowerCase(ch);
	    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
	return false;
    }

    private static void reverserString(String input) {
	String[] split = input.split("\\s");
	StringBuilder sb = new StringBuilder();
	for (int i = split.length - 1; i >= 0; i--) {
	    sb.append(split[i]);
	    if (i > 0) {
		sb.append(" ");
	    }
	}
	System.out.println("Reversed Order : " + sb.toString());
    }

    private static void maxRepeatLetter(String input) {
	input = input.toLowerCase();
	Map<Character, Integer> wordMap = new HashMap<>();
	for (char ch : input.toCharArray()) {
	    wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
	}
	char repeatedLetter = ' ';
	int count = 0;

	for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
	    if (entry.getValue() > count) {
		count = entry.getValue();
		repeatedLetter = entry.getKey();
	    }
	}
	System.out.println("Max Repeated letter is :" + repeatedLetter + " : " + count);
    }

}

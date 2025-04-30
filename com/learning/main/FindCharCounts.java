package com.learning.main;

import java.util.Map;
import java.util.stream.Collectors;

public class FindCharCounts {

    public static void main(String[] args) {
	String name = "dineshkumarsr";
	Map<Character, Long> collect = name.chars().mapToObj(n -> (char) n)
		.collect(Collectors.groupingBy(n -> (char) n, Collectors.counting()));

	System.out.println(collect);
    }

}

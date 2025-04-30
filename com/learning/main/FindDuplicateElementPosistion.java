package com.learning.main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementPosistion {

    public static void main(String[] args) {
	List<String> names = Arrays.asList("Ganesh", "Ganapathi", "Ganesh", "Dinesh", "Karthick", "Raja", "parveen",
		"Suchithra", "saraswathi", "saraswathi");
//	Map<String, Long> resultMap = names.stream()
//		.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
//	List<Integer> dupIndex = IntStream.range(0, names.size()).filter(i -> resultMap.get(names.get(i)) > 1)
//		.distinct().boxed().collect(Collectors.toList());

	Map<String, Long> collect = names.parallelStream()
		.collect(Collectors.groupingBy(name -> name, Collectors.counting()));

	List<Integer> collect2 = IntStream.range(0, names.size()).filter(name -> collect.get(names.get(name)) > 1)
		.distinct().boxed().collect(Collectors.toList());

	System.out.println(collect2);
    }

}

package com.learning.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {
	List<People> peoples = Arrays.asList(new People("Ganesh", 27, "kanchi"), new People("Muruga", 24, "palani"),
		new People("Shivan", 55, "kanchi"), new People("Parvat", 53, "kanchi"));

	List<People> sortedByPeopleName = peoples.parallelStream().sorted(Comparator.comparing(People::getName))
		.collect(Collectors.toList());

	List<People> sortByMultipleFields = peoples.parallelStream()
		.sorted(Comparator.comparingInt((People people) -> people.getName().length())
			.thenComparing(Comparator.comparingInt(people -> people.getAddress().length()))
			.thenComparing(Comparator.comparingInt(People::getAge).reversed()))
		.collect(Collectors.toList());
	System.out.println(sortedByPeopleName);
	System.out.println(sortByMultipleFields);
    }

}

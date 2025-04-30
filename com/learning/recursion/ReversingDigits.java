package com.learning.recursion;

import java.util.Map;
import java.util.stream.Collectors;

public class ReversingDigits {
public static void main(String[] args) {
	int input=12331;
	System.out.println(reverseDigits(input));
	
	String input1 = "Dinka chikka dinka chikka haye haye haeeeeee.";
    
    // Filter out spaces and count the frequency of each character

    Map<Character, Long> map = input1.chars().filter(c->c!=' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(c-> c,Collectors.counting()));
    map.forEach((character,count)->System.out.println(character+":"+count));

}

private static String reverseDigits(int input) {
	if(input==1) {
		return ""+1;
	}
	return (input%10) + ""+reverseDigits(input/10);
}
}

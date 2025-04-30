package com.learning.main;

import java.util.HashMap;
import java.util.Map;

public class WordAndCharCount {

    public static void main(String[] args) {
        String input = "Pushpa pushpa pushpa raj, yaarkum adagadhavan da indha pushpa raj uh.";

        duplicateWords(input);

        duplicateCharacters(input);
    }

	private static void duplicateCharacters(String input) {
		Map<Character , Integer> charCount= new HashMap<Character, Integer>();
		for(char ch:input.toLowerCase().toCharArray()) {
			if(Character.isLetter(ch)) {
				charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry:charCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	} 

	private static void duplicateWords(String input) {
		Map<String,Integer> wordCount=new HashMap<String, Integer>();
		
		String[] words=input.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s");
		for(String word:words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
		}
		for(Map.Entry<String, Integer> entry:wordCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
	}

	/*
	 * private static void duplicateCharacters(String input) { Map<Character,
	 * Integer> charCount = new HashMap<>(); for (char c :
	 * input.toLowerCase().toCharArray()) { if (Character.isLetter(c)) {
	 * charCount.put(c, charCount.getOrDefault(c, 0) + 1); } }
	 * 
	 * for(Map.Entry<Character,Integer> entry : charCount.entrySet()) {
	 * if(entry.getValue()>1) {
	 * System.out.println(entry.getKey()+":"+entry.getValue()); } } }
	 * 
	 * private static void duplicateWords(String input) { // Count duplicate words
	 * Map<String, Integer> wordCount = new HashMap<>(); String[] words =
	 * input.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+"); for (String
	 * word : words) { wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); }
	 * 
	 * for(Map.Entry<String,Integer> entry : wordCount.entrySet()) {
	 * if(entry.getValue()>1) {
	 * System.out.println(entry.getKey()+":"+entry.getValue()); } } }
	 */
}
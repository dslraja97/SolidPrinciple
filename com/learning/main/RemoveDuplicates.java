package com.learning.main;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "Hi can Keeper is Missed The Catch";
        String[] words = input.split(" ");
        for (String word : words) {
            String modifiedWord = removeConsecutiveRepeats(word);
            System.out.print(modifiedWord + " ");  // Print the modified word
        }
	}

	private static String removeConsecutiveRepeats(String word) {
		StringBuilder result= new StringBuilder();
		
		for(int i=0;i<word.length();i++) {
			if(i==0||word.charAt(i)!=word.charAt(i-1)) {
				result.append(word.charAt(i));
			}
		}
		
		return result.toString();
	}

}

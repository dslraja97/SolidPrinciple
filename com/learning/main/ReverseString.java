package com.learning.main;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: str = “i.like.this.program.very.much” 
//				Output: str = “much.very.program.this.like.i” 
//				Input: str = ”..geeks..for.geeks.” 
//				Output: str = “geeks.for.geeks”

		String input="..geeks..for.geeks.";
		String[] split = input.split("\\.");
		StringBuilder sb= new StringBuilder();
		for(int i=split.length-1;i>=0;i--) {
			sb.append(split[i]);
			if(i>0) {
				sb.append(".");
			}
		}
		System.out.println("Reversed Word : "+sb.toString());
	}

}

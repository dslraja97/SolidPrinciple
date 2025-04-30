package com.learning.main;

public class Time24HrsConversion {

    public static void main(String[] args) {
	String time = "12:07:45AM";
	int hour = Integer.parseInt(time.substring(0, 2));
	if (time.contains("AM")) {
	    if (hour == 12) {
		hour = 0;
	    }
	} else {
	    if (hour != 12) {
		hour += 12;
	    }
	}

	String hr24 = String.format("%02d", hour);

	System.out.println(hr24 + time.substring(2, time.length() - 2));

    }

}

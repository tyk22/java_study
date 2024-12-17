package com.gn.practice09;

import java.util.Calendar;

public class Run {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 1-1,1);
		Calendar cal2 = Calendar.getInstance();
		long time = cal2.getTimeInMillis()-cal.getTimeInMillis();
		
		time = time / 1000;
		time = time / (24*60*60);
		System.out.println(time);
		
	}

}

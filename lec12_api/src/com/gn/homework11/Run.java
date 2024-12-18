package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(8,51,22);
		DateTimeFormatter poc = DateTimeFormatter.ofPattern("KK시 mm분 ss초");
		System.out.println(start.format(poc));
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String ipint=sc.next();
		int time=0;
		
		if(ipint.toUpperCase()=="Y") {
			LocalTime stay = LocalTime.now();
			//time = 
		}
		
	}	

}

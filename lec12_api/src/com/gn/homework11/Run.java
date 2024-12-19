package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(8,51,22);
		DateTimeFormatter poc = DateTimeFormatter.ofPattern("KK시 mm분 ss초");
		System.out.println(start.format(poc));
		Scanner sc = new Scanner(System.in);
		
		int time=0;
		while(0==0) {
			System.out.print("입력 : ");
			String ipint=sc.next();
			
			if(ipint.toUpperCase().equals("Y")) {
			LocalTime now = LocalTime.now();
			long a = ChronoUnit.SECONDS.between(start, now);
			
			
			
		//System.out.println(star);
			System.out.println(a);
			}else if(ipint.toUpperCase().equals("N")) {
				System.out.println("종료합니다.");
				break;
	}
		}
	}
}
		/*LocalTime start = LocalTime.now();
		DateTimeFormatter poc = DateTimeFormatter.ofPattern("KK시 mm분 ss초");
		System.out.println(start.format(poc));
		Scanner sc = new Scanner(System.in);
		
		int time=0;
		while(0==0) {
			System.out.print("입력 : ");
			String ipint=sc.next();
			
			if(ipint.toUpperCase().equals("Y")) {
			LocalTime star = LocalTime.now();
			int a = (int)ChronoUnit.SECONDS.between(start, star);
			
			int b = (int)ChronoUnit.SECONDS.between(star, start);
			
		//System.out.println(star);
			System.out.println("경과(초) : "+a);
			}else if(ipint.toUpperCase().equals("N")) {
				System.out.println("종료합니다.");
				break;
		}
			System.out.println("다시 입력하세요. ");
	}	
	}
}*/


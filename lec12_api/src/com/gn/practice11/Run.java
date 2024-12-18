package com.gn.practice11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {

	public static void main(String[] args) {
// 1. 오늘 날짜 출력
// 2. 영화 개봉까지 남은 날 출력
// 3. 영화 개봉일의 요일 출력 -> getKoreanDayOfWeek 메소드 호출
// 4. 개봉일 출력
		LocalDate dayTime = LocalDate.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		LocalDate youn = LocalDate.of(2024,12,25);
		
		long gabong = ChronoUnit.DAYS.between(dayTime, youn);
		System.out.println(dayTime.format(format));
		System.out.println("영화 개봉까지 남은 날 : "+gabong+"일");
		youn.getDayOfWeek().getValue();
		int time = dayTime.getDayOfWeek().getValue();
		System.out.println("영화 개봉까지 남은 요일 : "+getKoreanDayOfWeek(time)+"요일");
		System.out.println(youn.format(format));
			}
			
public static String getKoreanDayOfWeek(int day) {
		switch(day) {
		case 1 : return "월"; 
		case 2 : return "금"; 
		case 3 : return "수"; 
		case 4 : return "목"; 
		case 5 : return "금"; 
		case 6 : return "토"; 
		case 7 : return "일"; 
		}
		return "";
	}

}

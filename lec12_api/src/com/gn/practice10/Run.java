package com.gn.practice10;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class Run {

	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 1주일 뒤 날짜 정보 출력
		// OO월 OO일 O요일
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_WEEK, 7);
		System.out.println(cal);
		Date day = cal.getTime();
		SimpleDateFormat simp = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(simp.format(day)); // 12월 24일 화요일 
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.MONTH, 1); // YEAR 년  MONTH 달
		System.out.println(cal2);
		Date day2 = cal.getTime();
		day2= cal2.getTime();
		System.out.println(simp.format(day2));
		

	}

}

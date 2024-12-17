package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.*;

public class Run {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// ↑오늘 날짜
		Date day = cal.getTime();
		SimpleDateFormat sp = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2025, 1-1, 24); // 오픈 날짜 날짜 인덱스
		
		System.out.println("오늘 날짜 : "+sp.format(day));
		long tim = cal2.getTimeInMillis()-cal.getTimeInMillis();
		tim = tim / 1000;
		tim = tim/(24*60*60);
		System.out.println("카페 오픈일까지 남은 날 : "+tim);
		int mon = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : "+mon);
		
		day = cal2.getTime();
		sp = new SimpleDateFormat("E요일");
		System.out.println("카페 오픈일의 요일 : "+sp.format(day));
	}

}

package com.gn.study.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		// Calendar
		Calendar call = Calendar.getInstance();
		System.out.println(call);
		
		int year = call.get(Calendar.YEAR);
		int mon = call.get(Calendar.MONTH)+1;// 인덱스로 날짜를 정해놨음 0월~11월 +1해줘야함

		System.out.println(year+"년 "+mon+"월");
		
		
		Calendar call2 = Calendar.getInstance();
		int year2 = call2.get(Calendar.YEAR);
		int mon2 = call2.get(Calendar.MONTH)+1;
		int date = call2.get(Calendar.DATE);
		int day = call2.get(Calendar.DAY_OF_WEEK);
		String str = "";
		switch(day) {
		case 1 : str = "일"; break;
		case 2 : str = "월"; break;
		case 3 : str = "화"; break;
		}
		System.out.println(year2+"년 "+mon2+"월 "+date+"일 "+str+"요일");
		
		// 날짜 변경 (1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE,25);
		christmas.set(2024, 12-1, 25);
		System.out.println(christmas);
		
		// 날짜 병경 (2) : add()
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.DATE, -7);
		
		// 문자열 형태 날짜 정보로 변환
		String toDay = "2024-05-14";
		String[] tamp = toDay.split("-");
		Calendar cal4 = Calendar.getInstance();
//		cal4.set(tamp[0], tamp[1]-1, tamp[2]);
		cal4.set(Integer.parseInt(tamp[0]),Integer.parseInt(tamp[1])-1,Integer.parseInt(tamp[2]));
		cal4.add(Calendar.MONTH, mon);
		System.out.println(cal4);
		
		// 두 날짜 사이의 차이 구하기
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2024, 10-1, 16);
		Calendar today = Calendar.getInstance();
		
		long diff= today.getTimeInMillis()-cal5.getTimeInMillis();
		// 1초 == 1000ms
		diff = diff/1000;
		// 24시간 60분 60초
		diff = diff/(24*60*60);
		System.out.println(diff);
		
		// 최대값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH); 
		System.out.println(last+"최대값");
		
		// Date 써보기
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		String printDate = sdf.format(d);
		System.out.println(printDate);
		
		
		Calendar cal7 = Calendar.getInstance();
//		cal7.add(Calendar.YEAR, 1);
		Date date2  = cal7.getTime()	;
		SimpleDateFormat das= new SimpleDateFormat("yy-MM-dd a KK:mm");
		das = new SimpleDateFormat("yyyy-MM-dd E요일 a KK:mm:ss");
		System.out.println(das.format(date2));
		
		
		
		
		
	}

}

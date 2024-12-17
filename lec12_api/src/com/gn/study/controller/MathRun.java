package com.gn.study.controller;

public class MathRun {

	public static void main(String[] args) {
		// 1. abs() : 절대값
		int num = -37;
//		num = num < 0 ? -num : num;
		num = Math.abs(num);
		System.out.println(num);
		
		// 2. pow() : n제곱 구하기
		double dnum = Math.pow(5, 2);
		System.out.println(dnum);
		int ret = 1;
		for(int i = 1; i <=4 ; i++) {
			ret *=5;
		}
		System.out.println(ret);
		
		// 3. Math.round() 반올림
		double pi = 3.1415926535;
		// 1) 원하는 자리수만큼 10의 지수 곱하기
		double multi = pi * Math.pow(10, 3);
		System.out.println(multi); // 3141.5926535 (*1000함)
		
		// 2) 반올림 
		double half = Math.round(multi); // .5여서 반올림됨
		System.out.println(half);// 3142.0
		
		// 3) 10의 지수 만큼 나누기
		double diw = half/Math.pow(10, 3); // 다시 원래대로 나눔
		System.out.println(diw);// 3.142
		
		// =====================
		double after = Math.round(pi*Math.pow(10, 2))/Math.pow(10, 2);
		System.out.println(after);
		
		// 4. 올림
		double up = Math.ceil(pi);
		System.out.println(up);
		
		// 5. 내림
		double down = Math.floor(pi);
		System.out.println(down);
		
		// 주의사항
		System.out.println(Math.ceil(1.0/2.0));  // ???	
		
		// 소수점 처리 가능
		System.out.println(Math.ceil(pi*Math.pow(10, 2))/Math.pow(10, 2));
		
	}

}

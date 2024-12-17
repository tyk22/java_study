package com.gn.practice07;

public class Run {

	public static void main(String[] args) {
		double num = 5.13824;
		
		double one = Math.round(num*Math.pow(10, 1))/Math.pow(10, 1);
		double one1 = Math.round(num*Math.pow(10, 2))/Math.pow(10, 2);
		double one2 = Math.round(num*Math.pow(10, 3))/Math.pow(10, 3);
		
		System.out.println("소수점 첫째자리까지 반올림 : "+one);
		System.out.println("소수점 둘째자리까지 반올림 : "+one1);
		System.out.println("소수점 셋째자리까지 반올림 : "+one2);
		
		
		System.out.println("소수점 첫째자리까지 반올림 : "+Math.round(num*Math.pow(10, 1))/Math.pow(10, 1));
		System.out.println("소수점 둘째자리까지 반올림 : "+Math.round(num*Math.pow(100, 1))/Math.pow(100, 1));
		System.out.println("소수점 셋째자리까지 반올림 : "+Math.round(num*Math.pow(1000, 1))/Math.pow(1000, 1));
		
		
	}

}

package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("국어 :");
		int gog = sc.nextInt();
		System.out.print("수학 :");
		int su = sc.nextInt();
		System.out.print("영어 :");
		int en = sc.nextInt();
		int sum = 0;
		
		if ( gog>=60 && su>=60 && en>=60 ) {
			sum= gog+su+en;
			if( sum /3 >=90) {
			System.out.println("합계 :"+sum+"점");
			System.out.println("평균 :"+sum/3+"점");
			System.out.println("휴대푠을 바꿀 수 있습니다. ");
			}else {
				System.out.println("휴대폰을 바꿀 수 없습니다.");
			}
		}else {
			System.out.println("휴대폰을 바꿀 수 없습니다.");
		}
		
	}

}

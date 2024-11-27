package com.gn.homework;

import java.util.Scanner;
public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
//		국어 : 89
//		영어 : 73
//		수학 : 45
//		총점 : 207
//		평균 : 69
		
		System.out.print("국어 : ");
		double gog = sc.nextInt();
		System.out.print("영어 : ");
		double yong = sc.nextInt();
		System.out.print("수학 : ");
		double su = sc.nextInt();
		
		int sem = ((int)gog+(int)yong+(int)su);
		
		System.out.println("총점 : "+sem);
		System.out.println("평균 : "+(sem/3));

	}

}

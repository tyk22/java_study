package com.gn.pactice;

import java.util.Scanner;

public class Pactice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길동 : ");
		int a = sc.nextInt();
		int[] scores = {54,23};
		int sum = 0;
		
		int[] gir = new int[scores.length+1];
		gir[scores.length] = a;
		for(int i=0; i < scores.length;i++) {
			gir[i]=scores[i];
			
			}
		for(int i=0; i < gir.length;i++) {
			System.out.println(gir[i]);
			sum=sum + gir[i];
		}
		System.out.println("총합 : "+sum);
		System.out.print("평균 : "+sum/gir.length);
	
		System.out.println();

		

	}
}



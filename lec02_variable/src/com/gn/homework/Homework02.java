package com.gn.homework;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
//		가로 : 13.5
//		세로 : 41.7
//		면적 : 562.95
//		둘레 : 110.4
		
		System.out.print("가로 : ");
		double ga = sc.nextDouble();
		System.out.print("세로 :");
		double se = sc.nextDouble();
		double mu = ga * se;
		double dor = (ga+se)*2;
		System.out.printf("면적 : "+"%.2f\n",mu);
		System.out.printf("면적 : "+"%.1f",dor);
		
//		- 면적 : 가로 * 세로
//		- 둘레 : (가로+세로)*2
		
	}

}

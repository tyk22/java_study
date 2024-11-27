package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
//		첫번째 숫자: **20**
//		두번째 숫자: **3**
//		덧셈 : 23
//		뺄셈 : 17
//		곱셈 : 60
//		몫 : 6
//		나머지 : 2
	
	
		
		Scanner num0 = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = num0.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("두번째 숫자: ");
		int num3 = num2.nextInt();
		
		System.out.println("덧셈 : "+(num1+num3));
		System.out.println("뺄셈 : "+(num1-num3));
		System.out.println("곱셈 : "+(num1*num3));
		System.out.println("몫 : "+(num1/num3));
		System.out.println("나머지 : "+(num1%num3));
	}

}

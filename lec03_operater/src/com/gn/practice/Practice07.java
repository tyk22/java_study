package com.gn.practice;
import java.util.Scanner;
public class Practice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
		int big = num1 < num2 ? (num2<num3 ? num3 : num2) : (num1 < num3 ? num3 : num1);
		System.out.println("세 수 중에서 큰 수는? "+big);
		
		int min = num1 > num2 ? (num2>num3 ? num3 : num2) : (num1 > num3 ? num3 : num1);
		System.out.println("세 수 중에서 작은 수는? "+min);
	}
	
}

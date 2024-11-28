package com.gn.honework;
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
		int min = num1 > num2 ? (num2>num3 ? num3 : num2) : (num1 > num3 ? num3 : num1);
		System.out.println("세 수 중에서 가장 작은 수는 "+min+"입니다. ");

	}

}

package com.gn.homework;
import java.util.Scanner;
public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
//		한 자리 숫자를 입력하세요: 3
//		입력한 숫자의 제곱은 9입니다.
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		String han = sc.nextLine();
		char at = han.charAt(0);
		
		int go = at-'0';
		
		//System.out.println(go*go);
		System.out.printf("입력한 숫자의 제곱은 %d입니다.", (go*go));

	}

}

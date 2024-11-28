package com.gn.practice;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		그리고 키보드로 값을 입력 받아서 checkNum을 초기화합니다.
//		만일 checkNum에 할당된 숫자가 양수일 경우
//		“양수입니다.”를 출력하는 프로그램을 만드세요.
//		2) 출력 예시
//		입력 : **123**
//		숫자 : 123
//		양수입니다.
		System.out.print("입력 : ");
		int checkNum = sc.nextInt();
		int c =checkNum;
		System.out.println("숫자 : "+checkNum);
		if(c>0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		
		

	}

}

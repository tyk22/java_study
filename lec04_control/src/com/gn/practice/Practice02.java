package com.gn.practice;
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1) 문제
//		사용자로부터 성적을 입력 받아서,
//		성적을 기준으로 학점을 부여하는 프로그램을 구성해주세요.
//		90점보다 높은 경우 : A
//		80(X) ~ 90(O)점 사이 : B
//		70(X) ~ 80(O)점 사이 : C
//		60(X) ~ 70(O)점 사이 : D
//		나머지 : F
		
//		성적 입력 : **85**
//		당신의 학점은 B입니다.
		
		System.out.print("성적 입력 : ");
		int hag = sc.nextInt();
		char c;
		
		if(hag>90) {
			// System.out.println("당신의 학점은 A입니다.");
			c='A';
		}else if(hag>80) {
			// System.out.println("당신의 학점은 B입니다.");
			c='B';
		}else if(hag>70) {
			// System.out.println("당신의 학점은 C입니다.");
			c='C';
		}else if(hag>60) {
			// System.out.println("당신의 학점은 D입니다.");
			c='D';
		}else {
			// System.out.println("당신의 학점은 F입니다.");
			c='F';
		}
		System.out.println("당신의 학점은 "+c+"입니다.");
		

	}

}

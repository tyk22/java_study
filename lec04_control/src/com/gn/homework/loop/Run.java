package com.gn.homework.loop;

import java.util.Scanner;

import com.gn.honework.test.Practice;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		실행할 기능을 입력하세요.
//		2. 구구단 무한반복
//		3. 탈출합시다.
//		6. 트리 만들기
//		7. 박수박수박
<<<<<<< HEAD
//		선택: 7
		
=======
//		선택: 7	
>>>>>>> branch 'master' of https://github.com/tyk22/java_study.git
		System.out.println("실행할 기능을 입력하세요. ");
		System.out.println("1. 1~50까지 짝수 합하기");
		System.out.println("2 . 구구단 무한반복");
		System.out.println("3. 탈출합시다."); // o
		System.out.println("4. 게임재시작");
		System.out.println("5. 양수만 더하기"); // o
		System.out.println("6. 트리 만들기");//o
		System.out.println("7. 박수박수박");
		System.out.println("8. 문자열의 개수"); // 해야함
		
		System.out.print("선택: ");
		
		
		
		Practice02 practice = new Practice02();
		int number = sc.nextInt();
		switch(number) {
		case 1 : practice.practice01();break;
		case 2 : practice.practice02();break;
<<<<<<< HEAD
		case 3 : practice.practice03();break;
		case 6 : practice.practice06();break;
=======
		case 4 : practice.practice04();break;
		case 5 : practice.practice05();break;
		case 7 : practice.practice07();break;
		// case 8 : practice.practice08();break;
>>>>>>> branch 'master' of https://github.com/tyk22/java_study.git
		}

	}

}

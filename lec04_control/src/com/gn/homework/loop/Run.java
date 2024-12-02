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
//		선택: 7
		System.out.println("했냐");	
		System.out.println("실행할 기능을 입력하세요. ");
		System.out.println("2 . 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.print("선택: ");
		
		
		
		Practice02 practice = new Practice02();
		int number = sc.nextInt();
		switch(number) {
		case 2 : practice.practice02();break;
		}

	}

}

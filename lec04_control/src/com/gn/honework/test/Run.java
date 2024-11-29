package com.gn.honework.test;

import java.util.Scanner;

// 메인 메소드
public class Run {

	public static void main(String[] args) {
		
		System.out.println("실행할 기능을 선택하세요. ");
		System.out.println("1. 놀이동산 입장료 계산하기");
		System.out.println("2. 일기예보");
		System.out.println("3. 세개의 정수 비교하기");
		System.out.println("4. 철수네 공장");
		System.out.println("5. 헬스 마니아 철수");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int meun = sc.nextInt();
		Practice practice = new Practice();
		
		switch(meun) {
		case 1 : practice.practice01();break;
		case 2 : practice.practice02();break;
		case 3 : practice.practice03();break;
		case 4 : practice.practice04();break;
		case 5 : practice.practice05();break;
		}
		sc.close();
		
		// 1번 기능 호출
		
		// practice.practice01();
		// 2번
		// practice.practice02();
	}

}

package com.gn.study;

public class Test {
	
	// 메인 메소드
//	라인 주석입니다.
	/*
	 * 블록 주석 여러 줄 주석 가능
	 */
	
	public static void main(String[] args) {
		// 1. print
		System.out.print("Hello World");
		
		// 2. println
		System.out.println(123);
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println(123);
		// 3. printf(표현식, 데이터) %s, %d, %.(123~...) f
		// 이름 : 김철수, 나이 : 25, 키 : 179.8
		System.out.printf("이름: %s, 나이 : %d, 키 : %.1f", "김철수",25,179.83);
		// 이스케이프 문자
		/*
		 *\n 
		 *\\
		 *\"
		 *\'
		 */
		System.out.println();
		System.out.println("\"안녕하세요.\"");
		System.out.println("hello\nworld");
		
		
	}
	
	
	
}

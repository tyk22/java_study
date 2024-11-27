package com.gn.study;

public class VariaBasic {
	// ctrl + s/b => "main"
	public static void main(String[] args) {
		
		// 1. 변수 선언
		int iber;
		// 2. 변수 초기화
		int age;
		age = 100;
		int age2 = 100;
		// 3. 변수 표준출력
		System.out.println(age);
		// 4. 변수의 재할당
		int score = 90;
		System.out.println("1 : "+score);
		score = 95;
		System.out.println("1 : "+score);
		
		// 5. 문자열 변수의 초기화 
		String str1 = new String("감사");
		String str2 = "합니다";
		
		// 6. 기본형과 문자열 비교
		
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1 == num2);
		String text1 = new String("apple");
		String text2 = "apple";
		System.out.println(text1 == text2); // 주소값 다름 
		System.out.println(text1.equals(text2)); //.equals 참조형 String 데이터 비교  
		
		String text3 = "apple";
		String text4 = "apple";
		System.out.println(text3 == text4);
		
		// 7. charAt()
		String word = "Hello";
		char first =
		word.charAt(0); //
		System.out.println(first);
		
		
		// 8. 업캐스팅 - (1) 할당
		// 값은 범위가 작은 데이터 > 큰 변수에 할당
		int a = 23;
		double b = a;
		
		// double c = 2.5;
		System.out.println(b);
		// System.out.println(a+c);
		
		// (2) 연산
		int c = 3;
		double d = 20.5;
		System.out.println(c+d);
		
		// 9. 다운캐스팅
		double d_num = 13.4;
		int i_num = 4;
		System.out.println(d_num+i_num);
		System.out.println((int)d_num+i_num);
		
		// 10. char형변환
		// (1) 할당
		char test = 'a';
		int su = test;
		su = test + 1;
		System.out.println((char)su);
		
		// (2) 연산
		int e = 50;
		char f = '2';
		System.out.println(e+f);
		
		
		//문자 형태로 작성된 숫자를 
		//온전한 숫자값으로 도출하는 방법
		System.out.println(f-'0'); 
		
		// 대문자 소문자
		System.out.println((char)((int)'a'-32));
		System.out.println((int)'A');
		
		System.out.println((char)65);
		
		// 11. 상수 ( 초기값 설정 ※대문자 약속
		final double PI = 3.14; 
		final int MAX = 100;
		
		
	}
	
	
}

package com.gn.study;

public class LoopStmt {

	public static void main(String[] args) {
		
		// 1. for문
		// 1~10까지 숫자 모두 출력
		// 초기식 > 출발점(1)
		// 조건식 > 도착점(10)
		// 증감식 > step(몇걸음씩)
		// for(초기식; 조건식; 증감식{}
		
		for ( int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		// 2. 초기식 생략
		int a = 1;
		for (;a<5;a++) {
			System.out.println(a);
		}
		
		// 무한루프
		// 3. 조건식 생략
		for ( int i = 1; ; i++) {
			System.out.println(i);
			if(i >= 10562) {
				break;
			}
		}
		
		// 4. 중첩 for문
		// i는 1~2 까지 하나씩 커지면서 반복
		// j는 1~3 까지 하나씩 커지면서 반복
		for ( int i=1; i<=2; i++) {
			
			System.out.println("A");
			
			for(int j=1;j<=3;j++) {
				System.out.println("B");
			}
			
			System.out.println("C");
		}
		// 5. 별찍기
		
		for ( int i = 1; i<=2; i++) {
			System.out.print("*");
			
			for(int a1=0;a1<3;a1++ ) {
				System.out.print("*");
			}
			System.out.println();
		
		
		}
		
		// 6. break를 사용한 중첩 for문
		// 외부 : 0에서 부터 2 미만(=제외) 1씩 커지면서 반복
		// 내부 : 0에서 부터 3 미만(=제외) 1씩 커지면서 반복
		
		for(int u=0; u<2;u++) {
			System.out.print("1 ");
			// break;
			for(int d=0;d<3;d++) {
				System.out.print("2 ");
				// break;
			}
			System.out.println("3 ");
			break;
		}
		
		// 7. while문
		int start = 1;
		/*while(start <=10) {
			System.out.println(start);
			start++;
		}*/
		while(true) {
			System.out.println(start);
			start++;
			if(start>10) {
				break;
			}
		}
		
		// 8. do~while문
		
		int count1 = 10;
		while(count1 > 0 && count1 < 10) {
			System.out.println("while문 출력");
			count1--;
			
		}
		
		int count2=10;
		do {
			System.out.println("do~while문 출력");
			count2--;
		}while(count2>0&&count2<10);
		
		
		// 9. continue
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				// continue;
				return;
			}
			System.out.println(i);
		}
		
		
		//length() < 문자열 길이
		// 특정 문자가 공백일 때 > 문자 == ' ';
		String str ="김철수";
		System.out.println(str);
		for(int i = 0; i < str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
		
		
		
		
	}
	

}

package com.gn.practice;
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 철수가 여권을 만드려고 함
		// 영어 이름 : Chulsu ?
		// 20대 이신가요 ?
		// 1. 철수의 영어 이름과 나이 정보를 "입력" 받음
		// 2. 3가지 논리형 데이터 출력
		
		
		System.out.print("영어 이름을 작성하세요 : ");
		String name = sc.next(); //equals
		name.equals(name);
		
		String chsu = "Chulsu";
		boolean cam = name.equals(chsu);
		
		System.out.print("나이 : ");
		int na2 = sc.nextInt();
		boolean na2bi = 20<=na2&&na2 <30;
		
		System.out.println("영어 이름이 일치하나요? "+ cam);
		//System.out.println("20대 인가요? "+ na2bi);
		System.out.println("20대 인가요? "+ (na2bi = 20<=na2&&na2 <30));
		System.out.println("영어 이름이 일치하면서 동시에 20대인가요? "+(cam&&na2bi));
		boolean tu;
		if ( na2 >= 30) {
			tu = false;
		}else {
			tu = true;
		}
		System.out.println(tu);
	
		
	}

}

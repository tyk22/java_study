package com.gn.practice01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Practice p = new Practice();
		System.out.print("첫번쨰 숫자 : ");
		int li = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int to = sc.nextInt();
		
		try {
			System.out.print("합 :");
			
			System.out.println(p.add(li, to));
			
		System.out.print("곱 : ");
		System.out.println(p.multiple(li, to));
		System.out.print("나누기 : ");
		System.out.println(p.divide(li, to));

		}catch(ArithmeticException e) {
		System.out.print("중 부적절한 연산이 발생했습니다."+"\n");
		}finally {
			System.out.println("마지막까지 잘 도착했음");
		}
		
	}

}

package com.gn.practice03.model.vo;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.println("제곱은 : "+calculator.square(a));
	}

}

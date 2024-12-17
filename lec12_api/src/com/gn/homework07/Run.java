package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random()*(100-1+1))+1;
		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");
		int can = 1;
		System.out.println(ran);
		while(1==1) {
			System.out.print("숫자를 입력하세요: ");
			int number = sc.nextInt();
			
			if(ran>number) {
				System.out.println("UP !");
				can++;
			}else if(ran<number){
				System.out.println("DOWN !");
				can++;
			}else {
				System.out.println("정답입니다 !!");
				System.out.println(can+"회만에 맞추셨습니다.");
				break;
			}
			
		}
	}
}

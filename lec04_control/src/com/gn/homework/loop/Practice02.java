package com.gn.homework.loop;

import java.util.Scanner;

public class Practice02 {
	Scanner sc = new Scanner(System.in);
		
	public void practice02(){
			
			//System.out.print("숫자 : ");
			int num =0;
			while(true) {
				System.out.print("숫자 : ");
				num = sc.nextInt();
				if(num==0) {
					System.out.println("종료 합니다. ");
					return;
				}else if(num<0) {
					System.out.println("양수만 입력해주세요. ");
				}
				else if(num<=9) {
					for(int i=1;i<=9;i++) {
						System.out.println(num+" * "+i+" = "+(num*i));
					}
				}else if(num>=10) {
					System.out.println("9 이하의 숫자만 입력해주세요. ");
				}
			}
		}
	public void practice03() {
		
		for(int i = 0; ; i++) {
			System.out.print("입력 : ");
			String hel = sc.nextLine();
			
			if(hel.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
			for (int j = 0; j < hel.length();j++) {
			System.out.print(hel.charAt(j));
				}
			System.out.println();
			}
	}
	public void practice06() {
		
		System.out.println("    *    "); // 빈칸 4칸, * 1개
		System.out.println("   ***   "); // 빈칸 3칸, * 3개
		System.out.println("  *****  "); // 빈칸 2칸, * 5개
		System.out.println(" ******* "); // 빈칸 1칸, * 7개
		System.out.println("*********"); // 빈칸 0칸, * 9개
		
		for(int i = 0; i>10;i++) {
			for(int j = 4;j<=0;j--) {
				System.out.println(" ");
			}
			System.out.println("*");
		}
	}
	public void practice07() {
		
		System.out.println("정수 : ");
		int jong = sc.nextInt();
		
	}
}
		
	
	
	



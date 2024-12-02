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
					break;
				}else if(num>=10) {
					System.out.println("9 이하의 숫자만 입력해주세요. ");
				
				}
			}
			
		}
}
		
	
	
	



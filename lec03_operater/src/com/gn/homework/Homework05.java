package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		String c = sc.next();
		c.charAt(7);
		//System.out.println(c.charAt(7));
		int a =0;
		a= c.charAt(7)-'0';
		//System.out.println(a);
		if(a==1 || a==3) {
			System.out.println("입력하신 주민번호는 남성입니다. ");
		}else if(a ==2|| a==4) {
			System.out.println("입력하신 주민번호는 여성입니다. ");
		}else {
			System.out.println("사람이 아닙니다. ");
		}
	}

}

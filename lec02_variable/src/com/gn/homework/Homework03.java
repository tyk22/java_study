package com.gn.homework;
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
//		문자열을 입력하세요 : apple
//		첫번째 문자 : a
//		두번째 문자 : p
//		세번째 문자 : p
		System.out.print("문자열을 입력하세요 : ");
		String add = sc.next();
		System.out.println(add.charAt(0));
		System.out.println(add.charAt(1));
		System.out.println(add.charAt(2));
		
		/*for(int i = 0; i<3; i++) {
			System.out.println(add.charAt(i));
		}*/
		
		
		

	}

}

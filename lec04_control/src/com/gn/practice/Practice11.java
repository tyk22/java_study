package com.gn.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// String str = sc.next();
		String str1 = sc.nextLine();
		
		System.out.println(str1.length());
	
		for(int i =0; i < str1.length(); i++) {

			// str1.equals(i) <  ※ 주소값으로 비교해서 안됨 ※
			if(str1.charAt(i)==' ') {	
				continue;
			}
			System.out.print(str1.charAt(i));
			
		}
		
	}

}

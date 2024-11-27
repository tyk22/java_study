package com.gn.homework;
import java.util.Scanner;
public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
//		문자를 입력하세요 : A
//		A의 유니코드 : 65
		System.out.print("문자를 입력하세요 : ");
		
		String mon = sc.next();
		char c = mon.charAt(0);
		System.out.print(mon+"의 유니코드 : "+(int)c);
		
		// System.out.printf(mon+"의 유니코드 : "+"%d", (int)mon);

	}

}

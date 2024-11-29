package com.gn.homework;
import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int a=29;
		System.out.print("사탕수 : ");
		int h = sc.nextInt();
		System.out.print("인원 : ");
		int g = sc.nextInt();
		//int b=100;
		
		System.out.println("1인당 사탕 개수 : "+g/h+"개");
		System.out.print("남는 사탕 개수 : "+g%h+"개");
		
		
	}

}

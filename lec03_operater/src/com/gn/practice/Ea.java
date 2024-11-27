package com.gn.practice;
import java.util.Scanner;

public class Ea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		num = num+3;
		System.out.println(num); //103
		num = num-10;
		System.out.println(num); //93
		num = num * 2;
		System.out.println(num); //186
		num = num / 3;
		System.out.println(num); //62
		num = num % 3;
		System.out.println(num); //2

	}

}

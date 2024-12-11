package com.gn.practice01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 : ");
		String nul = sc.next();
		System.out.print("두번째 : ");
		String nul1 = sc.next();
		p.printSum(nul, nul1);
	}

}

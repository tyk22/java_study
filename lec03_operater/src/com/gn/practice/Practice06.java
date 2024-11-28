package com.gn.practice;
import java.util.Scanner;
public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		첫번째 : **4**
//		두번째 : **57**
//		두 수 중에서 작은 수는? 4
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		
		int min = num1 > num2 ? num2 : num1;
		System.out.println("두 수 중에서 작은 수는? "+min);

	}

}

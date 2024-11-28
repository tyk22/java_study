package com.gn.practice;
import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		숫자(1) : **77**
//		숫자(2) : **44**
//		첫번째 숫자가 두번째 숫자보다 큰가요? true
		
		

		System.out.print("숫자(1) : ");
		int num1 = sc.nextInt();
		System.out.print("숫자(2) : ");
		int num2 = sc.nextInt();
		boolean bi = num1>num2;
		// System.out.print("첫번째 숫자가 두번째 숫자보다 큰가요? "+(num1 > num2));
		// System.out.print("첫번째 숫자가 두번째 숫자보다 큰가요? "+bi);
		
		if ( bi == true) {
			System.out.println(num1+"이 더 큽니다.");
		}else {
		 System.out.println(num1+"이 더 작습니다.");
		}

	}

}

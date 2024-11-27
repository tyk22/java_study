package com.gn.homework;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("몸무게(kg) : ");
		double kg = sc.nextDouble();
		System.out.print("키(m) : ");
		double m = sc.nextDouble();
		//몸무게(kg) / (키(m) * 키(m)) 입니다.
		double bmi = kg/(m*m);
		
		System.out.printf("BMI 지수 : "+"%.1f",bmi);
		//System.out.print("BMI 지수 : "+bmi);
			
		
//		몸무게(kg) : 70.0
//		키(m) : 1.80
//		BMI 지수 : 21.6

	}

}

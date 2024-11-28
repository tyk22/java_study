package com.gn.honework;
import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		3살 미만은 무료, 3세 ~ 12세는 10000원, 13세 ~ 18세는 20000원, 
//		19세 ~ 64세는 30000원, 65세 이상은 무료 입니다.
//		=== 놀이동상 입장료 계산하기===
//				나이 : 35
//				당신의 놀이동산 요금은 30000원입니다.
		System.out.println("=== 놀이동상 입장료 계산하기===");
		System.out.print("	나이 : ");
		int na2 = sc.nextInt();
		String yo;
		
		if(na2>=65) {
			yo = "무료";
			// System.out.println(yo);
		}else if (na2>=19) {
			yo = "30000원";
		}else if (na2>=13) {
			yo = "20000원";
		}else if (na2 >= 3) {
			yo = "10000원";
		}else {
			yo = "무료";
		}
		System.out.println("당신의 놀이동산 요금은 "+yo+"입니다.");
		
		
		
	}

}

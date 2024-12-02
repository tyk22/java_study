package com.gn.pactice;

import java.util.Scanner;

public class Pactice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int [] num = {-62,107,-12,89,-35};
		
		for(int day:num) {
			if(day>50) {
				System.out.println(day);
			}
		}*/
		
		int dq;
		int[] d = new int [5];
		for ( int i=0; i<5;i++) {
			dq = sc.nextInt();
			d[i]  = dq;
		}
		for(int i=0; i<5;i++) {
			if(d[i]>50) {
		System.out.println(d[i]);
			}
		}
		
	}
}
			
		// for( int i = 0; i < a.)

		
	//) 더해보기
	//	사용자로부터 길이 5의 배열에 들어가는 정수 데이터를 5개 입력받아서 배열을 구성한
	//	다음 그 중에서 50이 넘는 숫자를 출력해보세요.
	



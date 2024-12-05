package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	Scanner sc = new Scanner(System.in);
	public void practice01() {
		int a[] = {152, 180, 165, 158, 171};
		for (int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				int tem = a[j];
				a[j]=a[i];
				a[i]=tem;
				}
			}
		}
		for ( int i = 0; i <a.length;i++) {
				if(i<a.length-1) {
					System.out.print(a[i]+", ");
					// break;
				}else {
					System.out.println(a[i]);
				}
		}
	} // 01 종료

	public void practice02() {
//		사용자로부터 배열의 길이를 입력 받으세요. 
//		입력받은 길이의 정수형 배열을 선언하고 생성합니다. 
//		입력받은 배열의 길이 만큼 정수값을 입력 받아서 순서대로 인덱스에 값을 초기화하세요.
//		모든 인덱스에 값을 입력받으면 각 인덱스에 저장된 값과 총합을 출력하세요.
//		3) 출력 예시
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
		System.out.print("정수 : ");
		int jung = sc.nextInt();
		
		int[] bolong = new int[jung];
		
		for(int i = 0 ; i <bolong.length;i++) {
			
		}
		
	}
	
}

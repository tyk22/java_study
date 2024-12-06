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
		System.out.print("정수 : ");
		int jung = sc.nextInt();
		int sum=0;;
		int[] bolong = new int[jung];
		
		for(int i = 0 ; i <bolong.length;i++) {
			System.out.print("배열"+i+"인덱스에 넣을 값 : ");
			int intoo = sc.nextInt();
			bolong[i]= intoo;
		}
		for(int i = 0; i < bolong.length;i++) {
			System.out.print(bolong[i]+" ");
			if(bolong[i]>0) {
				sum=sum+bolong[i];
			}
		}
		System.out.println();
		System.out.print("총합 : "+sum);
		
	}// 02 종료
	public void practice03() {
//		사용자로부터 3 이상의 홀수(정수)를 입력받으세요. 
//		입력 받은 길이의 정수형 배열을 선언하고 생성하세요.
//		사용자가 입력한 정수가 홀수가 아니거나 3미만이라면 “다시 입력하세요”를 출력하세요.
//		그리고 다시 홀수 정수를 입력 받으세요. 
//		그 다음 0번 인덱스부터 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여 
//		내림차순으로 값을 넣어서 출력하세요. 
//		반드시 출력 예시를 보고 문제를 푸세요. 
//		3) 출력 예시 
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
//		3 > 이상 정수
		// 3 < 다시입력
		System.out.print("3 이상의 홀수 정수 : ");
		int jong = sc.nextInt();
		
		while(1==1) {
			
		}
		int[] bolong = new int[jong];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*while(1==1) {
		System.out.print("3 이상의 홀수 : ");
		int jung = sc.nextInt();
		if(jung%2==0) {
			System.out.println("다시 입력하세요.");
			
		}else if(jung<0) {
			System.out.println("다시 입력하세요.");
			
		}else {
		int[] bolong = new int[jung];
		for(int i=0; i<bolong.length;i++) {
			bolong[i]=i;
			System.out.print(bolong[i]+", ");
		
		}
		for(int j=bolong.length-1;j>0;j--) {
			System.out.print(bolong[j]-1+", ");
		}
	}
}*/
}
}

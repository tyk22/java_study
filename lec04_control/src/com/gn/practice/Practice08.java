package com.gn.practice;

public class Practice08 {

	public static void main(String[] args) {
		int tet=0;
		for(int i=2; i<=9;i++) {
			if(tet == 45) {
				System.out.println("계산 결과가 "+tet+"입니다. ");
				break;
			}
			System.out.println("==="+i+"단===");
			for(int a=1;a<=9;a++) {
				tet=a*i;
				System.out.println(i+" * "+a+" = "+tet);
			}
		}

	}

}

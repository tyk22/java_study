package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {
		
		int a = 0;
		for (int i = 1; ;i++) {
			a+=i;
			System.out.println(a);
			if(a>100) {
				System.out.println("초과된 값 "+a);
				break;
			}
			
		}

	}

}

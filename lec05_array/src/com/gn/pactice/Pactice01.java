package com.gn.pactice;

public class Pactice01 {

	public static void main(String[] args) {
		
		String[] friends = { "박지영", "김태우", "이지훈", "최유진", "정승호"};
		
		String[] age4 = {"a", "s", "d", "f", "g", "h"};
		
		
		
		String[] friends1 = new String[5];
		
		friends1[0] = "박지영";
		friends1[1] = "김태우";
		friends1[2] = "이지훈";
		friends1[3] = "최유진";
		friends1[4] = "정승호";
		
		
		
		for ( int i = 0; i <friends.length;i++) {
			System.out.println((i+1)+ " : "+friends[i]);
			
		}
		
		
		
		

		for(int i =0; i < friends.length;i++) {
			
			if(i %2==0) {
				System.out.println((i+1)+ " : "+friends[i]); // 짝수일때 출력 / 홀수
			} 
			
		}
		// System.out.println(friends1[0]);
		
		
		
	}

}

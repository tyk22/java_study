package com.gn.study;

public class Condit {

	public static void main(String[] args) {
		
		// 1. if문
		int number = 10;
		if (number > 5) {
			int su = 2;
			System.out.println("number는 5보다 큽니다.");
		}
		
		// 2. if~else문
		int num1 = -3;
		if(num1 >0 ) {
			System.out.println("양수 입니다. ");
		}else {
			System.out.println("음수 입니다. ");
		}
		
		// 3. if~else if ~else문
		
		int num2 = 3;
		if ( num2 >= 9) {
			System.out.println("9이상");
		}else if (num2 >=6) {
			System.out.println("9미만 && 6이상");
		}else if (num2 >= 3) {
			System.out.println("9미만 && 6미만 && 3이상");
		}else {
			System.out.println("3미만");
		}
		
		// 4. 중첩
		// 변수의 값이 양수 vs 음수
		// 양수 > 짝수 vs 홀수 (%2 ==0)
		
		int target = -5;
		if(target > 0){
			//양수
			if ( target % 2 == 0) {
				//짝수
			}else {
				// 홀수
			}
			
		}else if( target < 0 ) {
			// 음수
			
			
		}else {
			
			
			// 0
		}
		
		// 5. switch
	
		int day = 2; // 화요일
		// 오늘은 0요일 입니다.
		String text ="";
		switch(day) {
			case 0 : 
				text = "일";
				break;
			case 1 :
				text = "월";
				break;
			case 2:
				text = "화";
				break;
			default : text = "모르는";
		}
		System.out.println(text+"요일 입니다. ");
		
		// 조건 여러개가 수행하는 기능이 같은 경우
		int month = 7;
		switch(month) {
			case 1,3,5,7,8,10,12 : System.out.println("31일"); 
			break;
			case 4:case 6: case 9: case 11: System.out.println("30일");
			break;
			case 2: System.out.println("28일");
			break;
			default : System.out.println("존재하지 않는 달입니다. ");
			break;
		}
		
		
		
		
		
		
	}

}

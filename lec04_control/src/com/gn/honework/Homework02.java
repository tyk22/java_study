package com.gn.honework;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 /*
		  * 겨울은 1월, 2월, 12월이며 기온이 -15도 이하이면 한파 경보이고, 
		 -12 이하이면 한파 주의보입니다
		 3,4,5월은 봄이고, 
		 6,7,8월은 여름, 여름에 기온이 35도 이상이 되면 폭염 경보, 33도 이상이면 폭염 주의보입니다.
		 9,10,11월은 가을입니다. 
		 만일 1~12월 사이가 아닌 월을 입력하면 해당하는 계절이 없다고 알려주세요
		 
		 === 일기예보 ===
		월 : 7
		기온 : 38
		여름 폭염 경보
		 */
		System.out.println("=== 일기예보 ===");
		System.out.print("월 : ");
		int day = sc.nextInt();
		System.out.print("기온 : ");
		int gi = sc.nextInt();
		String season;
		if(day == 1|| day==2|| day==12) {
			
			// 겨울
			season = "겨울";
			if(gi <= -15){ 
				System.out.println(season+" 한파 경보");
			}else if(gi <= -12){
				System.out.println(season+" 한파 주의보");
			}else {
				System.out.println(season);
			}
			
		}else if(day==3||day==4||day==5) {
			
			// 봄
			season = "봄";
			System.out.println(season);
		}else if(day==6||day==7||day==8) {
			// 여름
			season = "여름";
			if(gi >= 35) {
				System.out.println(season+" 폭염 경보");
			}else if(gi >=33 ) {
				System.out.println(season+" 폭염 주의보");
			}else {
				System.out.println(season);
			}
		}else if(day==9||day==10||day==11) {
			//가을
			season = "가을";
			System.out.println(season);
		}else {
			System.out.println("해당하는 계절은 없습니다. ");
		}

	}

}

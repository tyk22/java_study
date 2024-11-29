package com.gn.honework.test;
//기능 메소드
import java.util.Scanner;
public class Practice {
	Scanner sc= new Scanner(System.in);
	
	// 1번 기능 : 놀이동산
	public void practice01() {
		System.out.println("=== 놀이동상 입장료 계산하기===");
		System.out.print("	나이 : ");
		int na2 = sc.nextInt();
		String yo;
		if(na2>=65) {
			yo = "무료";
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
	
	// 2번 기능 : 일기예보
	public void practice02() {
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
	public void practice03() {
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
		int min = num1 > num2 ? (num2>num3 ? num3 : num2) : (num1 > num3 ? num3 : num1);
		System.out.println("세 수 중에서 가장 작은 수는 "+min+"입니다. ");
	}
	
	
	// 철수네 공장
	public void practice04() {
		System.out.println("===철수네 공장===");
		System.out.print("수집된 코드 : ");
		int sugp = sc.nextInt();
		
		switch(sugp) {
		case 400:System.out.println("잘못된 요청입니다."); break;
		case 404 :System.out.println("요청하신 서비스를 찾을 수 없습니다."); break;
		case 500 :System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다."); break;
		case 503 :System.out.println("일시적인 서버 오류가 발생하였습니다."); break;
		default:System.out.println("알 수 없는 오류가 발생하였습니다.");
		break;
		}
//		(생략)
//		선택: 4
//		=== 철수네 공장 ===
//		수집된 코드 : 400
//		잘못된 요청입니다.
		public void practice05() {
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		int hls = sc.nextInt();
		String c = "";
		if(hls==5) {
			c = "종료";
		}else if(hls==4) {
			c= "풀업";
		}else if(hls==3) {
			c = "벤치 프레스";
		}else if(hls==2) {
			c = "데드리프트";
		}else if(hls==1) {
			c = "스쿼트";
		}else if(hls <= 0){
			System.out.println("양수만 입력해주세요. ");
		}else {
			System.out.println("목록에 있는 순자만 입력해주세요. ");
		}
		System.out.println(c+" 운동 시간입니다. ");

		
		
		
	}
	
	
}


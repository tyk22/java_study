package com.gn.practice04.model.vo;

import java.util.Scanner;

public class Car {
	
	Scanner sc = new Scanner(System.in);
	public void startEngine() {
		System.out.println("자동차 시동이 켜졌습니다.");
	}
	
	public int checkSpeed() {
		return 50;
	}
	
	public void setSpeed(int spd) {
		System.out.println("속도가 "+spd+"km/h로 설정되었습니다.");
	}

	public String setDestination(String dest) {
		return "목적지가 설정되었습니다: "+dest;
	}
	
	
	/*public String muji(String a) {
		System.out.println("노래를 틀까요? " );
		System.out.print( " y / n  :");
		String yn = sc.next();
		
		if (yn== "y") {
			System.out.println("인기가요 자동재생 하겠습니다.");
		}else {
			return "종료 합니다. ";
		}*/
		
	}
	

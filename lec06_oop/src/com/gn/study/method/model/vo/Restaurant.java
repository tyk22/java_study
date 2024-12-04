package com.gn.study.method.model.vo;

public class Restaurant {
	// 1. 매개변수x
	
	public void WelcomeMsg() {
		System.out.println("환영합니다 ~ ");
	}
	
	// 2. 기본형 매개변수
	// 테이블 번호를 입력받아서 출력
	
	public void setTabeNumber(int tabeNumber) {
		System.out.println("테이블 번호 "+tabeNumber+"에 앉으세요~");
	}

	// 3. 배열 매개변수
	// 주문 목록(배열)을 입력답아서 출력
	public void processOrder(String[] menuItems) {
		System.out.println("주문한번 확인하겠습니다. ");
		for(String item: menuItems) {
			System.out.println(item);
		}
	}
	
	// 4. 클래스 (객체) 매개변수
	// 음료수 세팅
	public void sodaSetting(Soda soda) {
		System.out.println(soda.name+" 먼저 세팅하겠습니다. ");
	}
	
	
	
	
	

}

package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospotal;
import com.gn.study.method.model.vo.Library;
import com.gn.study.method.model.vo.Smartphone;

public class Run {

	public static void main(String[] args) {
		
		// 객체 생성
		// 인스턴스화
		Smartphone myPhone=new Smartphone();
		
	
		
		// 1. 반환형x, 매개변수x
		myPhone.openApp();
		// 2. 반환형o, 매개변수x
		int battery = myPhone.checkBattery();
		System.out.println("잔량 배터리 : "+battery);

		// 3. 반환형x, 매개변수o
		myPhone.setVolume(15);
		
		// 4. 반환형o, 매개변수o
		String result = myPhone.sendMsg("자니..? ");
		System.out.println(result);
		
		
		// 객체화 -  가변인자 매개변수 ( 원하는대로 늘려서 사용가능 )
		Library library = new Library();
		
		library.borrowBooks("헤리포터", "반지의 제왕", "채식주의자");
		
		library.returnBooks(1000, "a", "s", "d", "f", "g", "h", "j");
		
		Hospotal hospo = new Hospotal();
		
		//인스턴스를 생성하지 ㅏ않고 메소드 호출 가능
		Hospotal.hospiInfo();
		myPhone.checWork();
		
		hospo.emergencyCall();
//		hospo.doctorCall();
//		hospo.staffAnnounemet();
//		hospo.persona();
		
		
		
	}

}

package com.gn.study.basic.model.vo;

import com.gn.study.method.model.vo.Hospotal;

public class Smartphone {
	// 1. 반환형x, 매개변수 x
	// > 앱 열림 메시지
	
	public void openApp() {
		System.out.println("앱이 열렸습니다. ");
	}
	
	// 2. 반환형o , 매개변수 x
	// > 배터리 잔량 리턴
	
	public int checkBattery() {
		return 85;
	}
	
	// 3. 반환형x, 매개변수 O
	// > 볼륨 입력하면 출력
	
	public void setVolume(int volume) {
		System.out.println("볼륨이 "+volume+"으로 설정되었습니다. ");
	}
	
	// 4. 반환형o, 매개변수o
	// 메시지 전송
	public String sendMsg(String msg) {
		return "메세지 \'"+msg+"\'가 전송되었습니다. ";
	}

	public void checWork() {
		Hospotal hoso = new Hospotal();
		hoso.emergencyCall();
		//hoso.doctorCall();
		//hoso.staffAnnounemet();
		// hoso.persona();
		
	}
	
	
	
	
	
	
	
	
}

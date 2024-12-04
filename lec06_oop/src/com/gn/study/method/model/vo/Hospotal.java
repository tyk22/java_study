package com.gn.study.method.model.vo;

public class Hospotal {
	// 1. 누구나 접근 가능한 응급전화(public)_
	public void emergencyCall() {
		System.out.println("응급 전화를 받습니다!! ");
	}
	
	// 2. 의사만 받을 수 있는 전화(protected)
	protected  void doctorCall() {
		System.out.println("의사만 받는 전화~");
	}
	
	// 3. 병원 내부에 있는 스태프 공지(default)
	void staffAnnounemet() {
		System.out.println("스태프 공지를 확인합니다. ");
		persona();
	}
	
	
	// 4. 개인 의료 기록(private)
	private void persona() {
		System.out.println("개인 의료 기록을 열람합니다. ");
	}
	
	// 5. 병원 정보 출력
	
	public static void hospiInfo() {
		System.out.println("저희 병원은 oo시 oo구에 있어요. ");
	}
	
	
	
	
	
}

package com.gn.study.model.vo;

public interface Alarm {
	// 상수 필드
	// 상수 > 변수명이 대문자, 스네이크 케이스 사용
	public static final int MAX_VOLUME = 10;
	// int MAX_VOLUME = 10; 인터페이스 안에 있으면 생략 가능
	// 추상 메소드 
	// public abstract 생략 가능
	void soundAlarm(); 
	
}

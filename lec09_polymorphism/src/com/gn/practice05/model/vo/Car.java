package com.gn.practice05.model.vo;

public class Car implements Vehicle, Machine{

	@Override
	public void turnOn() {
		System.out.println("자동차 시동을 겁니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("자동차 시동을 끕니다");
		
	}

	@Override
	public void speedUP() {
		System.out.println("자동차 속도를 높입니다.");
		
	}

	@Override
	public void speedDown() {
		System.out.println("자동차 속도를 줄입니다.");
		
	}

}

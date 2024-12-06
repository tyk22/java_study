package com.gn.practice02.model.vo;

public class WashingMachine extends Appliance{
	@Override
	public void tunrOn() {
		System.out.println("세탁기의 전원이 켜졌습니다. 세탁 모드를 선택해주세요.");
	}
}

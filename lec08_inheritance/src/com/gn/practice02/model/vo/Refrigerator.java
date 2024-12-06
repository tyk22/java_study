package com.gn.practice02.model.vo;

public class Refrigerator extends Appliance{
	@Override
	public void tunrOn() {
		System.out.println("냉장고의 전원이 켜졌습니다. 온도가 설정됩니다.");
	}
}

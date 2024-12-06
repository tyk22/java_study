package com.gn.study.model.vo;

public class Pizza extends Food{
	@Override // 틀린거 알려줌
	public void printReaction() {
		System.out.println("Buono!");
	}
}

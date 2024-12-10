package com.gn.study.model.vo;

// 사용자 정의 예외

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

package com.gn.study.model.vo;

public class Account {
	private String user;
	private int balance;
	
	public Account() {
		
	}
	public Account(String user, int balance){
		this.user=user;
		this.balance=balance;
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		//throw 썼으면 throws써야함
		if(amount>balance) {
			throw new InsufficientBalanceException("잔액이 부족합니다. ");
			
		}
		balance -= amount;
		System.out.println(amount+"원이 출금됐습니다. ");
	}
}

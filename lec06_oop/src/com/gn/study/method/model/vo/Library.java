package com.gn.study.method.model.vo;

public class Library {
	
	public void borrowBooks(String...books) {
		System.out.println("====대출할 책 목록====");
		for(String book : books) {
			System.out.println("-"+book);
		}
		
		
	}
	// 가변 인자 아닌 변수 먼저 써야함 
	public void returnBooks(int lateFee, String...books) {
		System.out.println("총 연체료 : "+lateFee);
		
		for(String book: books) {
			System.out.println("-"+book);
		}
	}

}

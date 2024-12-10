package com.gn.study.conntroller;

import com.gn.study.model.vo.Account;
import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.InsufficientBalanceException;
import com.gn.study.model.vo.User;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		
		try {
			System.out.println(a/b); // 여기서 멈춤
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}finally {
			System.out.println("계산끝 ! ");
//			System.out.println("아무거나");
		}
		
		
		System.out.println("----------------------");
		
		String[] arr = new String[3]; // [null][null][null]
									  //   
		//System.out.println(arr[0].length()); // NullPointerExcepotion
		try {
			System.out.println(arr[0].length()); 
		}catch(NullPointerException e) {
			System.out.println("오류");
		}
		System.out.println("----");
		int[] numbers = {1,2,3};
		try {
		System.out.println(numbers[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 초과 ");
		}
		//System.out.println(arr[4]); // ArrayIndexOutOfBoundsException
		
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		
		
		
		User u= new User();
		try {
			u.checkAge(18);
			
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
		u.nameLe(null);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인");
		
		
		Account ac = new Account("김철수",1000);
		
		try{
			ac.withdraw(5000);
		}catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}
	
	
}

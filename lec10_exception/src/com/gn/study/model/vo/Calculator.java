package com.gn.study.model.vo;

public class Calculator {
	public int divide(int a, int b) {
		// 1. 모든 블록에 return을 쓴다.
		/*try {
			return a/b;			
		}catch(ArithmeticException e) {
			return - 1;
		}*/
		// 2. 임이의 변수를 활용한다.
		int answer = -1;
		try {
			answer = a/b;
		}catch(ArithmeticException e) {
		//e.printStackTrace();
		//System.out.println("오류 : "+e.getMessage());
		System.out.println(e);
		}catch(NullPointerException e) {
		}catch(RuntimeException e) {
			
			
		}catch (Exception e) {
			
		}
		System.out.println("확인");
		return answer;
		
		
		
		
		
		
		
	}
}

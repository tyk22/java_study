package com.gn.study.model.vo;

public class AdvancedCalculator extends BasicCaculator{
	
//	@Override
//	public int add(a,d) {
//		return a+b;
//	}
	
	@Override
	public int sutract(int a, int b) {
//조건문과 반환형을 함께 사용할 경우
//모든 상황에 return 이 있어야 함
// 1. 조건문을 잘 쓴다
//		if ( a > b) {
//			return a-b;
//		}else {
//			return b-a;
//		}
// 2. 삼항연산자
//return a>b ? a - b : b-a;
// 3. default 리턴값을 세팅 - [ 조건문의 연장선 ]
		int result = a-b;
		if (b>a) {
			result = b-a;
		}
		return result;
		
		
		
	}
	
	
}

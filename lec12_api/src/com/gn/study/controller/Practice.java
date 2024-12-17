package com.gn.study.controller;

public class Practice {
	/* 매개변수로 전달받은 문자열을
	 * StringBuilder에 append 해서
	 * 문자열을 반환하는 메소드
	 */
	public String test(String str) {
		StringBuilder sd=
				new StringBuilder("test");
		sd.append(str);
		return sd.toString(); // String 되겠다는 선언
	}
}

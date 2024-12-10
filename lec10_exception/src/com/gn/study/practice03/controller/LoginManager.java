package com.gn.study.practice03.controller;

import com.gn.study.practice03.exception.InvalidCredentialsException;

public class LoginManager {
	public void login(String id, String pwd) 
			throws InvalidCredentialsException{
		if(isValodCredebtials(id, pwd)==false) {
			System.out.println("로그인이 실패하였습니다.\r\n"
					+ "잘못된 아이디와 비밀번호 입니다.");
		}else {
			System.out.println("성공적으로 로그인되었습니다.");
		}
	}
	
	private boolean isValodCredebtials(String id, String pwd) {
		
		if(id.equals("admin") && pwd.equals("admin1234!")){
			return true;
		}else {
		return false;
		}
	}
	
	
}

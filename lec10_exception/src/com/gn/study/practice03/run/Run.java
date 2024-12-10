package com.gn.study.practice03.run;

import java.util.Scanner;

import com.gn.study.practice03.controller.LoginManager;
import com.gn.study.practice03.exception.InvalidCredentialsException;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginManager lo = new LoginManager();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		
		
		try {
			lo.login(id, pwd);
			
		}catch(InvalidCredentialsException e) {
			
		}
	}

}

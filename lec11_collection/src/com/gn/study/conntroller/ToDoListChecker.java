package com.gn.study.conntroller;

import java.util.ArrayList;
import java.util.List;

public class ToDoListChecker {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		// 1. 리시트가 비어있는지 확인
		
		if(l.isEmpty()) {
			System.out.println("할 일이 아직 없습니다. ");
		}
		
		// 2. 할 일 추가
		
		l.add("운동하기");
		l.add("책 읽기");
		
		// 3. 특정 항목 확인
		if(l.contains("코딩 공부하기")) {
			System.out.println("O");
		}else {
			System.out.println("X");
			l.add("코딩 공부하기");
		}
		System.out.println(l);
		
		
		System.out.println(l.indexOf("코딩 공부하기"));
		if(l.indexOf("영화보기")==-1) {
			l.add("영화보기");
		}
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

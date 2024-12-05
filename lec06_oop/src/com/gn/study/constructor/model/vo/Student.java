package com.gn.study.constructor.model.vo;

public class Student {

	// 학번
	public void printInfo(int num) {
		System.out.println("당신의 번호는 "+num+"입니다. ");
	
	}
	
	// 학생 이름
	public void printInfo(String name) {
		System.out.println("당신의 이름은 "+name+"입니다.");
	
	}
	
	// 학생 번호, 이름 조회
	
	public void printInfo(int num, String name) {
		System.out.println(name+"님의 학번은"+num+"입니다.");
	}
	
	public void printInfo(String name,int num) {
		
	}
	
	//학생 나이
//	public void printInfo(int age) {
//		
//	}
	public void test(int i){}
	
	public void test(String str){}
	public void test(int i, String str){}   
	// public void test(int num){} ;x
	//public char test(int point){} ;
	public void test(int i, int k){}
	//public void test(int num, String string){};
	public void test(String str, int i){}
	
	
}

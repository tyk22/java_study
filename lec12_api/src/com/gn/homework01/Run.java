package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] ing = str.split("\n"); 
		String jjung = String.join(", ",ing);
		Person p = new Person();
		String jong = String.join(", ", str);
		
		String name;
		int age;
		String address;
		char gender;
		
		// 3 이름, 구
		// 2 나이.
		// 3 구
		// 5 나이 + 이름
		System.out.println(jjung);
		for(int i = 0 ; i < ing.length;i++) {
			//System.out.print(ing[i]);
			}
		
		
		
		for(int i = 0 ; i < ing.length;i++) {
		//System.out.print(ing[i]);
		}
		
		p.toString();
	}

}

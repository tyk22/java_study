package com.gn.study.controller;

public class StringRun {

	public static void main(String[] args) {
		// 1. 리터럴 > ""
		// 값이 같으면 hashCode 동일, 
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		// str += "World";
		//System.out.println(System.identityHashCode(str));
		
		String str1 = "Hello";
		
		System.out.println(System.identityHashCode(str1));
		
		if(str==str1) {
			System.out.println("같다");
		}
		// 2. new 연산자 > 객체 
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		// 3. equals
		System.out.println("equals() : "+("Hi".equals(str2)));
		// 4. length()
		System.out.println("length() : "+str2.length());
		// 5. charAt()
		System.out.println("charAt(i) durl : "+str2.charAt(0));
		// 6. toCahrArray()
		char[] arr = str2.toCharArray();
		System.out.println(arr);
		// 7. contains()
		System.out.println("contains() : "+str2.contains("lo"));
		// 8. compareTo()
		System.out.println("compareTo() : "+str2.compareTo("ZZZ"));
		// 9. concat() > 원본값 수정 불가 - String 불변 객체이기 때문
		String test = "우리는";
		// test.concat("할수있다."); < 이렇게 하면 못넣음
		test = test.concat("할수있다.");
		System.out.println(test);
		
		// ===========문자열 검색============ 
		// 10. indexOf < 앞에 기준으로 
		test = "2024.12.16.12.43";
		System.out.println(test.indexOf("."));
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("12")); // < ?
		
		// 11. split()
//		String[] time = test.split(".");
//		for(String t : time) {
//			System.out.println(t);
//		}
		String name = "김 철 수";
		String[] nameArr= name.split(" ");
		for(String n : nameArr) {
			System.out.println(n);
		}
		
		// 12. replace 문자열 바꾸기
		String ide = "eclipse";
		ide = ide.replace("e", "a"); // < 재할당 이유 : ※불변객체※ ( 다시 확인 ! 아니면 절대 안바뀜)
		
		System.out.println(ide);
		String id = "김 철 수";
		id = id.replace(" ", ""); // < ("대상", "바꿀값")
		System.out.println(id);
		
		// 13. 비어있는지 확인
		String empty1 = "";
		String empty2 = " ";
		System.out.println("(1) : "+empty1.isBlank());//  Blank 데이터 유무만 판단 
		System.out.println("(2) : "+empty2.isBlank());// 둘 다 true
		
		System.out.println("(3) : "+empty1.isEmpty());// Empty true
		System.out.println("(4) : "+empty2.isEmpty());// Empty 입장에서 " " 띄워쓰기도 문자로 인식함 false
		
		System.out.println(empty1.length()==0);
		empty2 = empty2.replace(" ", ""); // 공백 제거
		System.out.println(empty2.length()==0);
		String empty3 = " 안 녕 "; 
		empty3 = empty3.trim();
		System.out.println(empty3);
		
		String[] students = {"철수", "영희", "길동"};
		String allStudent = String.join("+", students);
		System.out.println(allStudent);
		
		String catTest = "hello world";
		System.out.println(catTest.substring(6));
		System.out.println(catTest.substring(0,5));
		System.out.println(catTest.substring(3,4));
		
		String file = "test.jpg";
		String ex = file.substring(file.lastIndexOf(".")+1);
		String filename = file.substring(0,file.lastIndexOf("."));
		System.out.println(ex+" : "+filename);
		
		
		
		
	}

}

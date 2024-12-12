package com.gn.study.conntroller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// Boxing
		Integer iNum = 100;
		
		//Unboxing
		int num = iNum;
		
		// parse 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1+num2);
		str2 = "1.34";
		System.out.println(str2+str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3+num3);
		
		
		
		// NumberFormatException
		try {
		
		String[] arr = new String[3];
		arr[0] = "일";
		int arrNum = Integer.parseInt(arr[0]);
		
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열");
		
		//ClassCastException 
		try {
		Object o = 9;
		String oStr = (String)o;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘음");// ↑말도 안되는 형변환
		
		// 제네릭 - 데이터 일반화
		Container<Integer> con = new Container();
		
		
		
		Container<String> ta = new Container();
		
		// List ( ArrayList )
		// 1. 선언과 생성 / 왼쪽 선언, > 오른쪽 생성
		List<String> list = new ArrayList<String>();
		
		// 2. 추가 ( add() )
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal);
		// add(index,Object)
		
		meal.add(1,"간식");
		System.out.println(meal);
		
		// 3. 삭제
		meal.remove(1); // meal.remove("간식"); 도 가능하긴함
		System.out.println(meal);
		// clear() 전체 삭제
		meal.clear();
		System.out.println(meal);
		
		// 4.요소 변경
		List<Integer> nume = new ArrayList<Integer>();
		nume.add(15);
		nume.add(10);
		nume.add(23);
		System.out.println(nume);
		
		nume.set(1, 55555);
		System.out.println(nume);
		
		// 5. 요소 조회
		
		nume.get(0);
		System.out.println(nume.get(0));
		
		for(int i = 0;i< nume.size();i++) {
			System.out.println(i+" : "+nume.get(i));
		}// ↓ Unboxing으로 int로 해도 ㄱㅊ
		for(Integer n : nume) {
			System.out.println(n);
		}
		
		
		// ArrayList의 정렬
		System.out.println("정렬전 : "+nume);
		Collections.sort(nume); // Collections.sort 오름차순
		System.out.println("오름차순 : "+nume);
		Collections.sort(nume, Collections.reverseOrder()); // Collections.reverseOrder() 순서가 반대로
		
		
		System.out.println("내림차순 : "+nume);
		
		// ArrayList<객체>
		List<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student("김철수",50));
		System.out.println(stud);
			//   equals비교함
		if(stud.contains(new Student("김철수", 50))) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
			//   equals비교함
		if(stud.indexOf(new Student("김철수", 50))!=-1) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		stud.add(new Student("영희", 40));
		stud.add(new Student("길동", 30));
		
		System.out.println("정렬 전 : "+stud);
		Collections.sort(stud);
		System.out.println("정렬 후 : "+stud);
	
	
		System.out.println("----------------------------");
		
		Set<String> city = new HashSet<String>();
		city.add("서울");
		city.add("부산");
		city.add("광명");
		
		System.out.println(city);
		// 중복 데이터 추가 시도
		city.add("서울"); // < 중복 데이터 못넣음
		System.out.println(city);
		
		
		/*for(String str:city) {
			System.out.println(str);
			city.remove(str);
			if(city.size()==0) {
				System.out.println("마지막");
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 삭제
		city.remove("서울");
		System.out.println("삭제 후 : "+city);
		city.clear();
		System.out.println("비우기 : "+city);
		
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수", 30));
		set1.add(new Student("이영희", 40));
		set1.add(new Student("홍길동", 50));
		set1.add(new Student("김철수", 30));
		// hashCode && equals  둘 다 참이여야함
		System.out.println(set1);
		
		set1.remove(new Student("김철수",30));
		System.out.println("삭제 후 : "+set1);
	}

}

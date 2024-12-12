package com.gn.study.conntroller;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.model.vo.Prd;
import com.gn.study.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(3);
		class2.add(4);
		class2.add(5);
		
		System.out.println("합집합");
		
		//class1.addAll(class2);
		Set<Integer> union = new HashSet<Integer>(class1); // < 깊은 복사 같음
		union.addAll(class2);
		System.out.println(class1);
		System.out.println(union);
		
		System.out.println("===교집합====");
		//class1.retainAll(class2);
		Set<Integer> inter = new HashSet<Integer>(class1);
		inter.retainAll(class2);
		System.out.println(class1);
		System.out.println(inter);
		
		System.out.println("===차집합===");
		Set<Integer> dife = new HashSet<Integer>(class1);
		dife.removeAll(class2);
		System.out.println(dife);
		
		Set<Student> set1=new HashSet<Student>();
		set1.add(new Student("철수", 20));
		set1.add(new Student("우석", 28));
		set1.add(new Student("은우", 30));
		
		Set<Student> set2=new HashSet<Student>();
		
		set2.add(new Student("길동", 25));
		set2.add(new Student("철수", 20));
		
//		set1.addAll(set2);
		
		//set1.retainAll(set2);
		set1.removeAll(set2);
		
		System.out.println(set1);
		
		
		Set<String> ful1 = new HashSet<String>();
		ful1.add("사과");
		ful1.add("바나나");
		ful1.add("체리");
		
		Iterator<String> iterator = ful1.iterator();
		
		
		while(iterator.hasNext()) {
			String ful1d = iterator.next();
			System.out.print(ful1d);
			iterator.remove();
			if(ful1.size() !=  0) {
				System.out.print(",");
			}
		}
		
		System.out.println("===LikedHashSet===");
		Set<String> set4 = new LinkedHashSet<String>(); // 차례대로 순서대로
//		set4 = new HashSet<String>(); 
//		set4 = new TreeSet<String>(); // 오름차순
		set4 = new TreeSet<String>(Collections.reverseOrder()); // TreeSet중 내림 차순
		set4.add("동");
		set4.add("서");
		set4.add("남");
		set4.add("북");
		System.out.println(set4);
		
		Set<Prd> set = new TreeSet<Prd>();
		set.add(new Prd("젤리",2000));
		set.add(new Prd("사탕",500));
		set.add(new Prd("홍삼",8000));
		
		System.out.println(set);
		
	}

}

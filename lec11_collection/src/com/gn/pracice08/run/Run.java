package com.gn.pracice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.pracice08.model.vo.Person;
import com.gn.practice07.model.vo.Equipment;

public class Run {

	public static void main(String[] args) {
		Set<Person> pap = new HashSet<Person>();
		pap.add(new Person("홍길동", 20));
		pap.add(new Person("이순신", 25));
		pap.add(new Person("유관순", 22));
		
		int i = 1;
		Set<Person> pap1 = new HashSet<Person>();
		pap1.add(new Person("유관순", 22));
		pap1.add(new Person("강감찬", 27));
		pap1.add(new Person("을지문덕", 30));
		
		System.out.println("=== 합집합 ===");
		Set<Person> ingan = new TreeSet<Person>(pap);
		ingan.addAll(pap1);
		Iterator<Person> ipm = ingan.iterator();
		//ingan = new TreeSet<Person>();
		while(ipm.hasNext()) {
			Person st = ipm.next();
			System.out.println(i+"번 "+st);
			i++;
		}
		
		System.out.println("=== 교집합 ===");
		Set<Person> ingan2 = new HashSet<Person>(pap);
		ingan2.retainAll(pap1);
		Iterator<Person> ipm1 = ingan2.iterator();
		
		i=1;
		while(ipm1.hasNext()) {
			Person st = ipm1.next();
			System.out.println(i+"번 "+st);
			i++;
		}
		
		System.out.println("=== 차집합 ===");
		Set<Person> ingan3 = new HashSet<Person>(pap);
		ingan3.removeAll(pap1);
		Iterator<Person> ipm2 = ingan3.iterator();
		i=1;
		while(ipm2.hasNext()) {
			Person st = ipm2.next();
			System.out.println(i+"번 "+st);
			i++;
		}
		
	}

}

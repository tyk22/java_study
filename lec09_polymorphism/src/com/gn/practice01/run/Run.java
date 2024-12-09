package com.gn.practice01.run;

import com.gn.practice01.model.vo.Employee;
import com.gn.practice01.model.vo.Person;
import com.gn.practice01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Person[] arr = new Person[2];
		
		
		Employee e = new Employee();
		
		Student st = new Student();
		arr[0] = e;
		arr[1]=st;
		
		for(Person p : arr) {
			p.introduce();
		}
	}

}

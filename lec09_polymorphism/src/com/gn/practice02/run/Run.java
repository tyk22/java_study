package com.gn.practice02.run;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		
		SchoolMember[] sch = new SchoolMember[3];
		
		Student a = new Student();
		Teacher b= new Teacher();
		Staff c = new Staff();
		sch[0] = a;
		sch[1] = b;
		sch[2] = c;
		
		/*
		 * 한번에 선언, 초기화
		 * arr[0] = new Strudent();
		 * ...
		 */
		
		for(SchoolMember go : sch) {
			go.introduce();
			if (go instanceof Student) {
				((Student)a).study();
			}else if(go instanceof Teacher) {
				((Teacher)b).teach();
			}else if(go instanceof Staff) {
				((Staff)c).work();
			}
		}
		
	}

}

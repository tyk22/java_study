package com.gn.practice01.run;

import com.gn.practice01.model.vo.Manager;

public class Run {

	public static void main(String[] args) {
		
		Manager n = new Manager("김철수", "영업부");
//		printInfo() 호출 : 직원 이름 출력
//		printDepartment() 호출 : 부서 정보 출력
		//n.printDeaprtment("김철수","영업부");
		n.printlnfo();
		n.printDeaprtment();

	}

}

package com.gn.practice07;

import com.gn.study.arr.model.vo.Academy;

public class Run {

	public static void main(String[] args) {

		Supplement[] sp1 = {new Supplement("유산균",1,18000),
				new Supplement("비타민B", 1,15000), 
				new Supplement("루테인", 2,20000),
				new Supplement("비타민D", 1, 12000)
				};
		System.out.println("========== 영양제 목록 ==========");
		
		
		for(Supplement a: sp1) {
			a.information();
		}
		
		
		/*for (Supplement a: sp1) {
			System.out.println("이름 : "+a.getName()+
					", 복용량 :"+a.getAgg()+"알"+
					", 가격 : "+a.getlog()+"원");
		}*/
	
	}

}

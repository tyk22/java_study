package com.gn.study.conntroller;

import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.OrangeJuice;

public class Run {

	public static void main(String[] args) {
		// 1. 클래스의 업캐스팅
		int i_num=3;
		double d_num = i_num;
		System.out.println(d_num);
		
		
		Beverage b1 = new Coffee();
		Beverage b2 = new OrangeJuice();
		
		b1.drink();
		// b1.ice > 
		
		Coffee b3 = new Coffee();
		
		b3 = (Coffee)b1;
		
		((OrangeJuice)b2).fresh(); // c+sp 안됨
		
		((Coffee)b1).ice(); // 강제 형변환같음
		
		b2.drink();
		
		// 2. 객체 배열과 다형성
		
		Beverage[] arr = new Beverage[3]; // 부모 배열 
		
		Beverage beb = new Beverage(); // 객체 생성
		arr[0]=beb;
		
		Coffee cof = new Coffee();
		arr[1]=cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		for(Beverage b : arr) {
			b.drink();
			// 만약에 진짜 데이터가 Coffee면 ice() 메소드 호출
			if (b instanceof Coffee) {
				((Coffee)b).ice();
			}else if(b instanceof OrangeJuice) {
				((OrangeJuice)b).fresh();
			}
			// 만약에 진짜 데이터가 OrangeJuice면 fresh() 메소드 호출
			
			
		}
		
		// 3. 클래스 다운캐스팅 
		
		
		
		
		
		
		
	}

}

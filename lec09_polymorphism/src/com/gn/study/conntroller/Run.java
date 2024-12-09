package com.gn.study.conntroller;

import com.gn.study.model.vo.Alarm;
import com.gn.study.model.vo.Animal;
import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Cat;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Earth;
import com.gn.study.model.vo.FireAlarm;
import com.gn.study.model.vo.Mars;
import com.gn.study.model.vo.OrangeJuice;
import com.gn.study.model.vo.Planet;

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
		
		// 4. 정적 바인딩 - 오버 로딩 
		System.out.println("==========");
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46); // 오버로딩 (매개변수)  정적 바인딩
		
		
		// 5. 동적 바인딩 - 오버라이
		Planet p1 = new Earth();
		Planet p2 = new Mars();
		p1.material();
		p2.material();
		myPlanet.material();
		
		// 6. 추상 메소드
		// abstract 클래스는 
		//Animal dog = new Animal(); < 추상클래스※인스턴스 안됨
		
		Animal dog = new Dog();
		dog.sound();
		Animal cat = new Cat();
		cat.sound();
		
		// 7. 인터페이스
		Alarm a = new FireAlarm();
		System.out.println(Alarm.MAX_VOLUME);
		a.soundAlarm();
	
	
	
	
	
	}
	

}

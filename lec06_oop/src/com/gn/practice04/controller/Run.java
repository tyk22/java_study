package com.gn.practice04.controller;

import java.util.Scanner;

import com.gn.practice04.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		System.out.print("속도 입력 : ");
		int sog = sc.nextInt();
		System.out.print("여행지 입력 : ");
		String jjd = sc.next();
		car.startEngine();
		
		System.out.println("기본 속도는 "+car.checkSpeed()+"km/h 입니다.");
		
		car.setSpeed(sog);
		
		System.out.println(car.setDestination(jjd));
				
	}

}

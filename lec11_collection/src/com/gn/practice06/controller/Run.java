package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {

	public static void main(String[] args) {
		Set<Food> fo = new HashSet<Food>();
		fo.add(new Food("샐러드", 14000));
		fo.add(new Food("치킨", 23000));
		fo.add(new Food("치킨", 50000));
		
		fo.remove(new Food("치킨", 50000));
		System.out.println("5만원 치킨 취소 :"+fo);
		
		fo.clear();
		//fo.remove(new Food("치킨", 23000));
		//fo.remove(new Food("샐러드", 14000));
		System.out.println("전체 주문 취소 : "+fo);
		

	}

}

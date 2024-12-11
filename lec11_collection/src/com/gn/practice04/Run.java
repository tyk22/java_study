package com.gn.practice04;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		List<Product> ic = new ArrayList<Product>();
		
		// ic.add(new Product("오렌지", 1500)); 
		ic.add(new Product("사과", 1000)); 
		ic.add(new Product("바나나", 2000)); 
		ic.add(new Product("딸기", 3000)); 
		
		System.out.println("=== for each로 조회 ===");
		for(Product a:ic) {
		System.out.println(a);
		}
		System.out.println("=== 기본 for문으로 조회 ===");
		ic.remove(1);

		ic.set(0, new Product("오렌지",1500));
		for(int i =0;i<ic.size();i++) {
			System.out.println(i+" : "+ic.get(i));
		}
	}

}

package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProducRun {

	public static void main(String[] args) {
		
		
		
		Product h = new Food("치킨", 20000, 3);
		Product y = new Book("자바의정석",15000);
		
		/*치킨의 최종 가격 : 10000
		자바의 정석의 최종 가격 : 13500*/
		System.out.print(h.getName()+"의 최종 가격 : ");
		System.out.println(h.calculatePrice());
		
		System.out.print(y.getName()+"의 최종 가격 : ");
		System.out.println(y.calculatePrice());
	}

}

package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProducRun {

	public static void main(String[] args) {
		
		
		
		Product h = new Food("치킨", 20000, 3);
		Product y = new Book("자바의정석",15000);
		
		System.out.println(h.getName());
		System.out.println(h.calculatePrice());
		

	}

}

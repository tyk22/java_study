package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Run {

	public static void main(String[] args) {
		Menu[] me = new Menu[5];
		
		
		for(int i =0; i<me.length;i++) {
			int rnd = (int)(Math.random()*(2-1+1))+1;
			
			if(rnd==1) {
				me[i] = new Dish("탕수육", 3, "짜장면");
			}else {
				me[i]= new Drink("콜라",1,"사이다");
			}
			
		}
		for(Menu co:me) {
			System.out.println(co);
		}

	}

}

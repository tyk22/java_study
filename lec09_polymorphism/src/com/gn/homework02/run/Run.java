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
				me[i] = new Dish("빵", 3000, "밀가루");
			}else {
				me[i]= new Drink("콜라",1000,"로지텍");
			}
			
		}
		for(Menu co:me) {
			co.cook();
		}

	}

}

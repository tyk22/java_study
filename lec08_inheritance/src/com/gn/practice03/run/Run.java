package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Circle[] ar = new Circle[2];
		ar[0]=new Circle(1,2,3);
		ar[1]=new Circle(3,3,4);
		
		Rectangle[] re = new Rectangle[2];
		re[0]=new Rectangle(-1,-2,5,2);
		re[1]=new Rectangle(-2,5,2,8);
		
		
		
		
		System.out.println("=== circle ===");
		for(Circle d:ar) {
			d.draw();
		}
		System.out.println("=== rectangle === ");
		for(Rectangle d:re) {
			d.draw();
		}
		
		
		
		
	
	}

}

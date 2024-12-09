package com.gn.practice03.run;

import com.gn.practice03.model.vo.Bicycle;
import com.gn.practice03.model.vo.Car;
import com.gn.practice03.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		
		Vehicle wht = new Bicycle();
		Vehicle why = new Car();
		
		
		why.go();
		wht.go();
	}
}

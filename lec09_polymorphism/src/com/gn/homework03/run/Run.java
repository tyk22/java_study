package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.Engine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {

	public static void main(String[] args) {
		
		ElectricEngine el = new ElectricEngine();
		GasolineEngine gas = new GasolineEngine();
		Car c = new Car(el);
		Car e = new Car(gas);
		
		e.startEngine();
		c.startEngine();
	}

	
	
}

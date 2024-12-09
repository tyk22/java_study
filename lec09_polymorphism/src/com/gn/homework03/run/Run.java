package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.Engine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {

	public static void main(String[] args) {
		Car c = new Car(ElectricEngine());
		Car e = new Car(GasolineEngine());
		
		c.startEngine();
		e.startEngine();
	}

	private static Engine GasolineEngine() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Engine ElectricEngine() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

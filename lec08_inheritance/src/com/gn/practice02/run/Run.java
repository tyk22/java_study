package com.gn.practice02.run;

import com.gn.practice02.model.vo.Appliance;
import com.gn.practice02.model.vo.Refrigerator;
import com.gn.practice02.model.vo.WashingMachine;

public class Run {
	public static void main(String[] args) {
		
		Appliance r = new Appliance();
		WashingMachine w = new WashingMachine();
		
		
		Refrigerator re = new Refrigerator();
		r.tunrOn();
		w.tunrOn();
		re.tunrOn();
	}
}

package com.gn.practice07.model.vo;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerDay;
	
	public Equipment() {
		
	}
	public Equipment(String name, int pricePerDay) {
		this.name=name;
		this.pricePerDay=pricePerDay;
	}
	
	public int hashCode() {
		return Objects.hash(name,pricePerDay);
	}
	public boolean equals(Object obj) {
		boolean bo = false;
		if(obj instanceof Equipment) {
			Equipment eq = (Equipment)obj;
			if(eq.name.equals(name)&&
					eq.pricePerDay==pricePerDay) {
				bo=true;
			}
			
		}
		return bo;
	}
	
	public String toString() {
		return name+" : "+pricePerDay+"원";
	}
}

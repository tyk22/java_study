package com.gn.study.model.vo;

public class Flower {

	private String name;
	private String color;
	
	public Flower() {
		
	}
	public Flower(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	@Override
	public boolean equals(Object obj) {
		Flower f = (Flower)obj;
		
		if(this.color.equals(f.color)&&this.name.equals(f.name)) {
			return true;
		}else {
			return false;
		}	
	}
	// Info 랑 비슷하다 생각했움
	@Override
	public String toString() {
		return "이름 : "+name+"\n색상 : "+color;
	}
	
	
	
	
	
	
	
	
	
}

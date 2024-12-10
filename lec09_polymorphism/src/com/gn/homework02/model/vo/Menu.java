package com.gn.homework02.model.vo;

public abstract class Menu {
	private String name;
	private int price;
	
	Menu(){
		
	}
	
	Menu(String name, int price){
		this.name=name;
		this.price=price;
	}
	public String toString() {
		//return name;
		return "메뉴명은 "+name+"이고, 가격은 "+price+"원입니다. ";
		
	}
	public abstract void cook();
}

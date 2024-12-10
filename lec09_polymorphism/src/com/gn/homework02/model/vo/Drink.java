package com.gn.homework02.model.vo;

public class Drink extends Menu{
	private String recipe;
	
	public Drink() {
		
	}
	public Drink(String name, int price, String recipe) {
		super(name,price);
		this.recipe=recipe;
	}
	
	public void getRecipe() {
		
	}
	public void setRecipe() {
		
	}
	@Override
	public String toString() {
		return "레시피는 "+recipe+"입니다.";
	}
	@Override
	public void cook() {
		toString();
		System.out.println(super.toString()+toString());
	}
	
	
}

package com.gn.homework02.model.vo;

public class Dish extends Menu{
	private String ingredients;
	public Dish() {
		
	}
	public Dish(String name, int price, String ingredients) {
		super(name,price);
		this.ingredients=ingredients;
	}
	public void getIngredients() {
		
	}
	public void setIngredients() {
		
	}
	@Override
	public String toString() {
		return "재료는"+ingredients+"입니다. ";
	}
	@Override
	public void cook() {
		System.out.println(super.toString()+toString());
		}
	
}

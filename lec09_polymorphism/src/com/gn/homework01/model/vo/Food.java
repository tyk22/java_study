package com.gn.homework01.model.vo;

public class Food extends Product{
	private int exporationDays;
	
	public Food() {
		
	}
	public Food(String name, int price, int exporationDays) {
		super(name,price);
	
		this.exporationDays=exporationDays;
	}
	
	public int getExporationDays() {
		
		
	
		return exporationDays;
		
	}
	
	public int calculateDiscountRate() {
		
		if (exporationDays<1) {
			return 80;
		}else if(exporationDays<5) {
			return 50;
		}else if(exporationDays<10) {
			return 20;
		}else {
			return 0;
		}
	}
	
	@Override
	public int calculatePrice() {
		
		return (getPrice()*(100-calculateDiscountRate())/100);
		
		
	}
	
}

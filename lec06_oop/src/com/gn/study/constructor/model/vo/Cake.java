package com.gn.study.constructor.model.vo;

public class Cake {
	public String flavor = "초코";
	
	public static int price = 27000;
	
	{flavor="딸기";}
	static {price = 32000;}
	public Cake() {
		this.flavor = "녹차";
		//this.price = 40000;
	}
	
 
	
}

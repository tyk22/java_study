package com.gn.study.model.vo;

public class Prd implements Comparable<Prd>{
	private String name;
	private int price;
	
	public Prd() {
		super();
	}
	
	public Prd(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public int compareTo(Prd other) {
		/*if(this.price>other.price) {
			return 1;
		}else if(this.price<other.price) {
			return -1;
		}else {
			return 0;
		}*/
		// return this.price-other.price;
		return this.name.compareTo(other.name);
	}
	
	
	public String toString() {
		return name+" : "+price+"원";
	}
}

package com.gn.practice07;

public class Supplement {
	private String name;
	private int agg;
	private int log;
	
	public Supplement() {
		
	}
	
	public String getName() {
		return name;
	}
	public int getAgg() {
		return agg;
	}
	public int getlog() {
		return log;
	}
	
	public Supplement(String name, int agg, int log) {
		this.name=name;
		this.agg=agg;
		this.log=log;
	}
	
	public void information() {
		
		System.out.print("이름 :"+name);
		System.out.print(", 복용량 : "+agg+"알");
		System.out.print(", 가격 :"+log+"원"+"\n");
		
	}
	
	
	
	
	
	
	
	
}

package com.gn.study.conntroller;

public class Snack {
	private  String flavor;		
	private  int calory;		
	
	public Snack() {
	}
	public Snack(String flavor,int calory) {
		this.calory=calory;
		this.flavor=flavor;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "[맛=" + flavor + ", 칼로리=" + calory + "]";
	}
}

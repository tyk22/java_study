package com.gn.study.conntroller;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(calory, flavor);
	}
	@Override
	public boolean equals(Object obj) {
		boolean re = false;
		if (obj instanceof Snack) {
			Snack other = (Snack)obj;
		if(other.flavor.equals(this.flavor)&&
				other.calory==this.calory) {
			re=true;
		}
	}
	return re;

}
}
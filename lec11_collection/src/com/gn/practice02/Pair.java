package com.gn.practice02;

public class Pair<T,U> {
	private T first;
	private U second;
	
	public Pair() {
		
	}
	public  Pair(T first, U second) {
		this.first=first;
		this.second=second;
	}
	
	public T getFirst() {
		return first;
	}
	public U getSecond() {
		return second;
	}
	
	
}

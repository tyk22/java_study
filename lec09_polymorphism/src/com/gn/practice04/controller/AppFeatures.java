package com.gn.practice04.controller;

public abstract class AppFeatures {

	public abstract void dusplay();
	public abstract void input();
	
	public void close() {
		System.out.println("기능을 종료합니다. ");
	}
}

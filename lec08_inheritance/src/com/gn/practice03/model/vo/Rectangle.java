package com.gn.practice03.model.vo;

public class Rectangle extends Point{

	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		super.draw();
		System.out.printf("면적 : "+(width*height)+"\n");
		System.out.printf("둘레 : "+2*(width+height)+"\n");
}
}

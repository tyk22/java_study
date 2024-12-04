package com.gn.practice05.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountrRate;
	
	
	public Book() {
		
	}
	
	public void Book(String title,int price,String author) {
		this.title=title;
		this.price=price;
		this.author=author;
	}
	public void Book(String title,String publisher,String author,int price,double discountrRate) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
		this.price=price;
		this.discountrRate=discountrRate;
	}
	
	public void information() {
		
		System.out.println("==="+title+"===");
		System.out.println("저자 :"+publisher);
		System.out.println("출판사 : "+author);
		System.out.println("가격 :"+price+"원");
		System.out.println("할인율 :"+discountrRate);

	}
	/*
	protected String title(String name) {
		return "==="+name+"===";
	}
	
	protected String publisher(String jinna) {
		return "저자 : "+jinna;
	}
	
	protected String author (String mix) {
		return "출판사 : "+mix;
	}
	
	protected int price (int gag) {
		return gag;
	}
	
	protected double discountRate(double disc) {
		return disc;
	}
	
	public void Bookk() {
		Book boo = new Book();
		System.out.println(boo.title(null));
		boo.title(null);
		System.out.println(boo.publisher(null));
		boo.publisher(null);
		System.out.println(boo.author(null));
		boo.author(null);
		System.out.println("가격 :"+boo.price(0));
		boo.price(0);
		System.out.println("할인율 :"+boo.discountRate(0));
		boo.discountRate(0);
		}
	*/
	
	
	
}

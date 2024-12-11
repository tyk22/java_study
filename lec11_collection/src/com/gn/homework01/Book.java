package com.gn.homework01;

public class Book {
	private String title;
	private String author;
	private String category;
	private int proce;
	
	public Book() {
		
	}
	public Book(String title,String author, String category, int proce) {
		this.title=title;
		this.author=author;
		this.category=category;
		this.proce=proce;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public int getProce() {
		return proce;
	}
	public void setproce(int proce) {
		this.proce=proce;
	}
	
	public String toString() {
		return "도서명 :"+title+"\n"+
				"저자명 :"+author+"\n"+
				"장르 : "+category+"\n"+
				"가격 : "+proce;
	}
	
}

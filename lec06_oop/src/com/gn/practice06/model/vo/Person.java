package com.gn.practice06.model.vo;

public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public void setId(String id) {
		this.id=id;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	
	// ==
	
	/* get도 동일 
	public String getId() {
	return id;
==================================
}
	
	// info
	public String information() {
		return "";
		
		
	}*/
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Person() {
		
	}
	public Person(String id,String pwd, int age, char gender, String phone, String email) {
		this.id=id;
		this.pwd=pwd;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.email=email;
	}
	
	public void setPerson(String id,String pwd, int age, char gender, String phone, String email) {
		this.id=id;
		this.pwd=pwd;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.email=email;
	}
	
	public String information() {
		return "id : "+id+"\n"+
				"pwd : "+pwd+"\n"+
				"name : "+name+"\n"+
				"age : "+age+"\n"+
				"gender : "+gender+"\n"+
				"phone : "+phone+"\n"+
				"email : "+email;
		
	}
	
	
}

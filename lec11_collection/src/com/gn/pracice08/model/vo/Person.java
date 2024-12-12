package com.gn.pracice08.model.vo;

import java.util.Collection;
import java.util.Objects;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		boolean bo = false;
		Person pr = (Person)obj;
		if(obj instanceof Person) {
			if(pr.name.equals(name)&&pr.age==age) {
				bo = true;
			}
		}
		return bo;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
		
	}
	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}
}

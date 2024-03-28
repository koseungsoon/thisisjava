package com.spring.ex01;

import lombok.Data;


public class Student {

	private int ban;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int ban, String name) {
		super();
		this.ban = ban;
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

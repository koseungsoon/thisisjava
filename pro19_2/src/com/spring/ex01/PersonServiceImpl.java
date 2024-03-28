package com.spring.ex01;

public class PersonServiceImpl implements PersonService {

	private String fruit;
	private int amount;

	public PersonServiceImpl() {

	}

	public PersonServiceImpl(String fruit) {
		super();
		this.fruit = fruit;
	}

//	public void setFruit(String fruit) {
//		this.fruit = fruit;
//	}

	@Override
	public void sayHello() {
		System.out.println(fruit);
		System.out.println(amount);

	}

	public PersonServiceImpl(String fruit, int amount) {
		super();
		this.fruit = fruit;
		this.amount = amount;
	}

}

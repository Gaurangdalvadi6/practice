package com.javaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("25")
	private int age;
	@Autowired
	@Qualifier("laptop") //qualifier ne @primary karta vadhu prefex male 
	private Computer com;
	
	
	public Alien() {
		System.out.println("Alien object created...");
	}
	
	public Alien(int age, Computer com) {
		super();
		this.age = age;
		this.com = com;
	}

	public int getAge() {
		return age;
	}
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public void code() {
		System.out.println("Coding....");
		com.compile();
	}
}
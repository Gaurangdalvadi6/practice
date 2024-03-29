package com.javaa;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop implements Computer {

	public Laptop() {
		System.out.println("Laptop object created...");
	}
	
	@Override
	public void compile() {
		System.out.println("compiling using laptop...");
	}
}

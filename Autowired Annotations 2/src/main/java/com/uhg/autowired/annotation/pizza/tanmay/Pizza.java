package com.uhg.autowired.annotation.pizza.tanmay;

import org.springframework.beans.factory.annotation.Autowired;

public class Pizza {
	
	@Autowired
	private Cheese cheese;
	
	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public void make() {
		System.out.println("making pizza");
		cheese.show();
	}

}

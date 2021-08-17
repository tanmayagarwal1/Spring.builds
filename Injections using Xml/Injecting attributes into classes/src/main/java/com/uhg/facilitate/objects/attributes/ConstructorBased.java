package com.uhg.facilitate.objects.attributes;

public class ConstructorBased {
	private String name;
	private int id;
	
	public ConstructorBased(String name, int id) {
		this.id = id;
		this.name = name;
	}
	
	public ConstructorBased(String name) {
		this.name = name;
	}
	
	public ConstructorBased(int id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println(name + " has id : " + id);
	}

}

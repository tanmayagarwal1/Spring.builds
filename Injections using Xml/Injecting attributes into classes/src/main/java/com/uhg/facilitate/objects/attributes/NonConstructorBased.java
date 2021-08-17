package com.uhg.facilitate.objects.attributes;

public class NonConstructorBased {
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println(name + " has id : " + id);
	}
	
	

}

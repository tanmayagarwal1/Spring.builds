package com.uhg.autowired.annotation.tanmay;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone {
	
	@Autowired
	private Processor cpu;
	
	
	
	public Processor getCpu() {
		return cpu;
	}



	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}



	public void display() {
		System.out.println("This is a Phone with a processor");
		cpu.disp();
	}

}

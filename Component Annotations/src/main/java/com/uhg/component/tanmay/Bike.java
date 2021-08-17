package com.uhg.component.tanmay;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void run() {
		System.out.println("Bike is runing");
	}

}

package com.uhg.component.tanmay;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void run() {
		System.out.println("Car is runing");
	}

}

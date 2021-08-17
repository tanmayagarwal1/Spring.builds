package com.uhg.component.tanmay;

import org.springframework.stereotype.Component;

@Component
public class Jet implements Vehicle{
	public void run() {
		System.out.println("Jet is flying");
	}

}

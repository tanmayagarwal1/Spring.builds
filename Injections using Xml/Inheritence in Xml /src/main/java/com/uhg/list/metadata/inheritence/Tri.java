package com.uhg.list.metadata.inheritence;
import java.util.*;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tri implements InitializingBean, DisposableBean{
	private ArrayList <Points> points = new ArrayList<>();
	
	public ArrayList<Points> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Points> points) {
		this.points = points;
	}

	public void run() {
		for (Points x : points) {
			System.out.println("X co-ord is : " + x.getX() + " Y co-ord is : " + x.getY());
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Created");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed");
		
	}

}

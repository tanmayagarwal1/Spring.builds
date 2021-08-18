package com.uhg.facilitate.list.objects;
import java.util.*;

public class Triangle {
	private ArrayList<Point> points = new ArrayList<>();

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	
	public void run() {
		for (Point p : points) {
			System.out.println(p.getX() + " and " + p.getY());
		}
	}

}


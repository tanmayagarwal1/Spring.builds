package com.uhg.facilitate.inject.objects_to_classes;

public class Triangle {
	private Point Px;
	private Point Py;
	private Point Pz;
	
	public Point getPx() {
		return Px;
	}
	public void setPx(Point px) {
		Px = px;
	}
	public Point getPy() {
		return Py;
	}
	public void setPy(Point py) {
		Py = py;
	}
	public Point getPz() {
		return Pz;
	}
	public void setPz(Point pz) {
		Pz = pz;
	}
	
	public void run() {
		System.out.println("This is a triangle with points : ");
		System.out.println(Px);
		System.out.println(Py);
		System.out.println(Pz);
		
	}
	
	

}

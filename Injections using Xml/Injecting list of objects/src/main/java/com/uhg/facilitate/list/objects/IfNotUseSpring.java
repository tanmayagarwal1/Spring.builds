package com.uhg.facilitate.list.objects;

import java.util.ArrayList;

public class IfNotUseSpring {
	public void run() {
		Point px = new Point();
		Point py = new Point();
		px.setX(10);
		px.setY(0);
		py.setX(0);
		py.setY(10);
		ArrayList<Point> list = new ArrayList<>();
		list.add(px);
		list.add(py);
		Triangle tri = new Triangle();
		tri.setPoints(list);
		tri.run();
	}

}

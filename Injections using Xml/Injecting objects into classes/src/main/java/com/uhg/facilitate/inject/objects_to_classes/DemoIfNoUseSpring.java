package com.uhg.facilitate.inject.objects_to_classes;

public class DemoIfNoUseSpring {
	Triangle tri = new Triangle();
	Point my_x = new Point();
	Point my_y = new Point();
	Point my_z = new Point();
	public void run() {
		my_x.setX(0);
		my_x.setY(0);
		my_y.setX(10);
		my_y.setY(0);
		my_z.setX(0);
		my_z.setY(-10);
		tri.setPx(my_x);
		tri.setPy(my_y);
		tri.setPz(my_z);
		tri.run();
	}

}

package chap04;

class Triangle {
	private double base;
	private double h;

	public Triangle(double base, double h) {
		this.base = base;
		this.h = h;
	}

	public double getBase() {
		return base;
	}

	public double getH() {
		return h;
	}

	public double findArea() {
		return 1.0 / 2.0 * base * h;
	}

	public boolean isSameArea(Triangle t) {
		if (t.findArea() == findArea())
			return true;
		return false;
	}
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}

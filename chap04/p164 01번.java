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
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}
}

import java.util.Scanner;
public class P118 {
	public static void main(String[] args) {
		int result = 1;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	static int factorial(int x) {
		int r = 1;
		while (x > 1) {
			r = r * x;
			x--;
		}
		return r;
	}

	static int factorial(int a, int b) {
		int r = 1;
		while (a <= b) {
			r = r * a;
			a++;
		}
		return r;
	}
}

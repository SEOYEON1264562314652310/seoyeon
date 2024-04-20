import java.util.Scanner;
public class P122 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

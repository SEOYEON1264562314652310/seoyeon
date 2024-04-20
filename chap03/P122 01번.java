import java.util.Scanner;
public class P122 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r;
		System.out.println("정수를 입력하세요");
		r = in.nextInt();
		if (r >= 19) {
			System.out.print("성년");
		} else {
			System.out.print("미성년");
		}
	}

import java.util.Scanner;
public class P122 {
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int a, r;
				r = 0;
				do {
					System.out.print("양의 정수를 입력하세요: ");
					a = in.nextInt();
					if (a % 2 == 0)
						r = a + r;
				} while (a > 0);
				System.out.print(r);
			}
		}

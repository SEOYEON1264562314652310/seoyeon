import java.util.Scanner;
public class P122 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a;
			System.out.print("등수를 입력하세요: ");
			a = in.nextInt();
			switch (a) {
			case 1:
				System.out.print("아주 잘했습니다.");
				break;
			case 2, 3:
				System.out.print("잘했습니다.");
				break;
			case 4, 5, 6:
				System.out.print("보통입니다.");
				break;
			default:
				System.out.print("노력해야겠습니다.");
			}
		}
	}

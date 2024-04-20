import java.util.Scanner;
public class P80{
	public static void main(String[] args) {
		int m;
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		m = in.nextInt();
		System.out.println(m / 3600 + "시간 " + m / 60 + "분" + m % 60 + "초"); 
	}
} 

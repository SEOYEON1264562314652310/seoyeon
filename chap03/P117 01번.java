import java.util.Scanner;

    	public class P117 {
    		public static void main(String[] args) {
    			int result = 1;
    			int n;
    			Scanner in = new Scanner(System.in);
    			System.out.print("정수를 입력하세요");
    			n = in.nextInt();
    			while (n > 1) {
    				result = result * n;
    				n--;
    			}
    			System.out.print((int) result);
    		}
    	}

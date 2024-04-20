import java.util.Scanner;
public class P76 {
    public static void main(String[] args) {
        int a;
        char b;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        a = in.nextInt();
        b = (a % 2 == 0) ? '짝' : '홀'; 
        System.out.println(b + "수");
    }
}

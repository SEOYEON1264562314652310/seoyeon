import java.util.Scanner;

public class four4 {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        String a = "com";
        String b ="java";
        String c = "bye";

        do{
            System.out.print("URL을 입력하세요: ");
            s = in.next();

            if (s.endsWith(a)){
                System.out.println(s + "은 'com'으로 끝납니다.");
            }
            if (s.contains(b)){
                System.out.println(s + "은 'java'를 포함합니다.");
            }
        } while (!s.equals(c));
    }
}

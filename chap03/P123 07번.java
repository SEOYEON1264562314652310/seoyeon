import java.util.Scanner;

public class P123 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }

    static String input(String a) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s : ", a);
        a = in.next();

        return a;
    }

    static void whosWin(String a, String b){
        boolean result;
        result = a.equals(b);

        if (result)
            System.out.println("무승부");
        else if ((a.equals("r")&&b.equals("s"))||(a.equals("s")&&b.equals("p"))||(a.equals("p")&&b.equals("r")))
            System.out.println("철수, 승!");
        else
            System.out.println("영희, 승!");
    }
}

import java.util.Scanner;

public class P123 {
    public static void main(String[] args) {
        String 철수, 영희;
        boolean result;
        Scanner in = new Scanner(System.in);
        System.out.print("철수 : ");
        철수 = in.next();
        System.out.print("영희 : ");
        영희 = in.next();

        result = 철수.equals(영희);
        if (result)
            System.out.println("무승부");
        else if ((철수.equals("r") && 영희.equals("s"))|| (철수.equals("s") && 영희.equals("p")) || (철수.equals("p") && 영희.equals("r")))
            System.out.println("철수, 승!");
        else
            System.out.println("영희, 승!");
    }
}

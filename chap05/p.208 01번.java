import java.util.Scanner;

public class fiveone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("문자열을 입력하시오: ");
        String s = in.nextLine();
        System.out.print("찾을 문자를 입력하시오: ");
        char c = in.next().charAt(0);

        System.out.println(countChar(s, c));

    }

    static int countChar(String s, char c){
        int n = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
                n++;
        }
        return n;
    }
}

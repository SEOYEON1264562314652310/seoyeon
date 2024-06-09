import java.util.Scanner;

public class four6 {
    public static void main(String[] args) {
        System.out.print("배열을 입력하세요: ");
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        reverse(n);
    }

    public static int[] reverse(int[] org){
        for (int i = 5; i >0; i--){
            System.out.print(org[i- 1] + " ");
        }
        return org;
    }
}

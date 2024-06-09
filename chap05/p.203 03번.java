import java.util.Scanner;

public class gradeOne {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);
        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for (int i = 0; i < numOfStudents; i++)
            scores[i] = in.nextInt();

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int score: scores)
            System.out.print(score + " ");;
        System.out.println();

        for (int i = 0; i < numOfStudents; i++) {
            if (scores[i] >= 90)
                System.out.println((i + 1) + "번 학생의 등급은 " + Grade.최우수 + "입니다.");
            else if (scores[i] >= 80 && scores[i] < 90)
                System.out.println((i + 1) + "번 학생의 등급은 " + Grade.우수 + "입니다.");
            else if (scores[i] >= 70 && scores[i] < 80)
                System.out.println((i + 1) + "번 학생의 등급은 " + Grade.보통 + "입니다.");
            else if (scores[i] >= 60 && scores[i] < 70)
                System.out.println((i + 1) + "번 학생의 등급은 " + Grade.미흡 + "입니다.");
            else
                System.out.println((i + 1) + "번 학생의 등급은 " + Grade.탈락 + "입니다.");
        }
    }
}

enum Grade {
    최우수, 우수, 보통, 미흡, 탈락;
}

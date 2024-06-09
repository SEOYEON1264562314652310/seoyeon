import java.util.Scanner;

abstract class Echoer{
    void start(){
        System.out.println("시작합니다.");
    }

    abstract void echo();

    void stop(){
        System.out.println("종료합니다.");
    }
}

public class EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echoer e = new Echoer() {
            @Override
            void echo() {
                String a = in.nextLine();
                System.out.println(a);
                String b = in.nextLine();
                System.out.println(b);
                String c = in.nextLine();
                System.out.println(c);
            }
        };
        e.start();
        e.echo();
        e.stop();
    }
}

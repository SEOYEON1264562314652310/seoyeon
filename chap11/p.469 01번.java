import java.util.ArrayList;

public class ch11 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();

        lst.add("갈매기");
        lst.add("나비");
        lst.add("다람쥐");
        lst.add("라마");

        lst.forEach(s -> {
            if (s.length() == 2) System.out.println(s);
        });

    }
}

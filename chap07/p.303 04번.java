import java.awt.*;

public class TalkableTest {
    static void speak(Talkable o){
        o.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}

interface Talkable{
    void talk();
}

class Korean implements Talkable{
    public Korean() {
    }

    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable{
    public American() {
    }

    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}

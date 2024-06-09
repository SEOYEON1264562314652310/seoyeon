public class GirlTest {
    public static void main(String[] args) {
        Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};

        for (Girl g : girls)
            g.show();
    }
}

class Girl{
    protected String name;

    public Girl(String name) {
        this.name = name;
    }

    void show(){
        System.out.println(name + "는 자바 초보자이다.");
    }
}

class GoodGirl extends Girl{

    public GoodGirl(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(name + "는 자바를 잘 안다.");
    }
}

class BestGirl extends GoodGirl{

    public BestGirl(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(name + "는 자바를 무지하게 잘 안다.");
    }
}

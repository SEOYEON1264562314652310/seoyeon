public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        ColoredCircle a = new ColoredCircle(10,"빨간색");

        c.show();
        a.show();
    }
}

class Circle{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void show(){
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
}

class ColoredCircle extends Circle{
    String color;

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    @Override
    void show() {
        System.out.println("반지름이 " + radius + "인 " + color +  " 원이다.");
    }
}

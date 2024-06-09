public class fooDemo {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("잘 있어");
    }

    static void foo(String a, int x){
        System.out.println(a + " " + x);
    }

    static void foo(String a, int x, int y){
        System.out.println(a + " " +  x + " " + y);
    }

    static void foo(String a){
        System.out.println(a);
    }
}

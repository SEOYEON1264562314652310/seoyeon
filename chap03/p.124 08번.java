public class faccase {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n){
        return switch(n)
        {
            case 0 -> 1;
            case 1 -> 1;
            default -> factorial(n-1)*n;
        };
    }
}

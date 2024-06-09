class Complex{
    private double n1 = 0.0 , n2 = 0.0;

    public Complex(double n1) {
        this.n1 = n1;
    }

    public Complex(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void print(){
        System.out.println(n1 + " + " + n2 + "i");

    }
}

public class fourSix {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}

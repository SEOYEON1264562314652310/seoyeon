class Car{
    private String color;
    private static int numOfCar = 0;
    private static int numOfRedCar = 0;

    public Car(String color) {
        this.color = color;

        if (color.equals("red") || color.equals("RED")){
            numOfRedCar ++;
        }
        numOfCar++;
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
}

public class fourFive {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", Car.getNumOfCar(),Car.getNumOfRedCar());
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("Amy", 30, 200, "U.S.A")};

        for(Person p : people)
            p.show();
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void show(){
        System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person {
    private int number;

    public Student(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    void show() {
        System.out.println("학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + number + "]");
    }
}

class ForeignStudent extends Student{
    private String country;

    public ForeignStudent(String name, int age, int number, String country) {
        super(name, age, number);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    void show() {
        System.out.println("외국학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + getNumber() + ", 국적 : " + country + "]");
    }
}

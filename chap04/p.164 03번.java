class Member{
    private String name, id, passward;
    private int age;

    public Member(String name, String id, String passward, int age) {
        this.name = name;
        this.id = id;
        this.passward = passward;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassward() {
        return passward;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setPassward(String passward){
        this.passward = passward;
    }

    public void setAge(int age){
        this.age = age;
    }
}

public class fourThree {
    public static void main(String[] args) {
        Member a = new Member("전서연", "hi123", "010101", 21);
        System.out.println(a.getName());
        System.out.println(a.getId());
        a.setPassward("1111111");
        System.out.println(a.getPassward());
        System.out.println(a.getAge());
    }

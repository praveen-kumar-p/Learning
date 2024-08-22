package ex_August;

public class encap {
    public static void main(String[] args) {

        son f = new son("Praveen", 28);
        f.setAge(30, false);
        System.out.println(f.getAge());
        f.setName("Pradeep", false);
        System.out.println(f.getName());
    }

}
class son {

    private String name;
    private int age;

    public son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isadmin) {
        if (isadmin){
            this.name = name;
        }else {
            System.out.println("Not able to change the name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, boolean admin) {
        if (admin){
            this.age = age;
        }else {
            System.out.println("Not able to change the age");
        }

    }

}

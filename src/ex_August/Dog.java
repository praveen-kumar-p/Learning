package ex_August;

public class Dog {

    String name;
    int age;

    Dog(){
        name = "chow chow";
        age = 3;
    }

    Dog(String n, int a){
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println(d.name);
        System.out.println(d.age);

        Dog d1 = new Dog("German sephard", 05);

        System.out.println(d1.name);
        System.out.println(d1.age);
    }

}

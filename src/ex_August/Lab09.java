package ex_August;

import org.w3c.dom.ranges.DocumentRange;

public class Lab09 {
    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println(d.name);
        System.out.println(d.age);


        Dog d1 = new Dog("streat dog", 6);
        System.out.println(d1.name);
        System.out.println(d1.age);

        Dog d2 = new Dog("Tucker", 10);
        System.out.println(d2.name);
        System.out.println(d2.age);
    }
}

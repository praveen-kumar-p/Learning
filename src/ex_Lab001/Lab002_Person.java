package ex_Lab001;

public class Lab002_Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Praveen";
        person.gender = "Male";
        person.age = 28;

        person.eat();
        System.out.println(person.name);
        System.out.println(person.gender);

        person.talk();
        System.out.println();

    }
}

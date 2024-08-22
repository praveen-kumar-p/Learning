package ex_August.superthiskey;

public class Lab014 {
    public static void main(String[] args) {

        person1 p = new student1();
    }
}


class student1 extends person1{

    student1(String a){
        System.out.println("Student constructor");
    }

    student1(){
//        super();
//        super("Praveen");
        super("Praveen", 18);
    }
}
class person1{

    person1(){
        System.out.println("Default Constructor");
    }
    person1(String a){
        System.out.println("parameter argument 1  Constructor");
    }

    person1(String a, int b){
        System.out.println("parameter argument 2 Constructor");
    }
}
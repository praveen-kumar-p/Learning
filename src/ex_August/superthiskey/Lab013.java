package ex_August.superthiskey;

public class Lab013 {
    public static void main(String[] args) {
        person p = new student();
        p.message();

    }
}

class student extends person{

    @Override
    void message(){
        System.out.println("I am student message");
        super.message();
    }
}

class person{
    void message(){
        System.out.println("I am person message");
    }
}
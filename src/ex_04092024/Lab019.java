package ex_04092024;

public class Lab019 {
    public static void main(String[] args) {
        Vehicle v = new car();
        v.display();
    }
}

class car extends Vehicle{
    int b = 200;

    car(){
        super(2);
        System.out.println("Default Constructor");
    }

    @Override
    Vehicle display(){
        System.out.println(this.b);
        System.out.println(super.speed);
        return null;
    }
}

class Vehicle{
    int speed = 150;

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterized constructor");
    }

    Vehicle display(){
        System.out.println("Vehicle Speed");
        return null;
    }
}
package ex_August.superthiskey;

public class Lab012 {

    public static void main(String[] args) {
        vehicle v = new car();
        v.display();
    }
}

class car extends vehicle{
    private int speed = 210;

    car(){
        super(4);
        System.out.println("DC car constructor");
        this.display();
    }
    @Override
    void display(){
        System.out.println("car speed is " + this.speed);
        System.out.println("car speed is " + super.speed);
        super.display();
        this.display();
    }
}


class vehicle{
    public int speed = 150;

    vehicle(){
        System.out.println("DC Vehicle constructor");
    }

    vehicle(int a){
        System.out.println("DC Vehicle constructor");
    }
    void display(){
        System.out.println("Vehicle spped");
    }
}
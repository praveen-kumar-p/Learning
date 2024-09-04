package ex_04092024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excep {
    public static void main(String[] args) {

        // Exception are of Two Types
        // Checked --> JVM Knows about it

//        try {
//            FileInputStream file = new FileInputStream("C://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        // UnChecked --> JVM don't know
//        int a = 10;
//        int b = 0;
//        try {
//            b = a/0;
//        } catch (Exception e) {
//            System.out.println("Number div by zero");
//        }
//        System.out.println("End of the program");

//        int d = 0;
//        String s = null;
//        int r = 0;
//        try {
//            s = args[0];
//            r = Integer.parseInt(s);
//            d = 1000/r;
//        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(d);
//        System.out.println("End of the Program");

        final double pi = 3.14;
        int a = 0;
        int x = 0;
        try {
            x = 10/a;
        } catch (Exception e) {
            System.out.println("div by zero");
        } finally {
            System.out.println("I will be executed anywhere!!");
        }
        System.out.println(x);
        System.out.println(pi);
    }
}

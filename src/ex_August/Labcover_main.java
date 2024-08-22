package ex_August;

public class Labcover_main {
    public static void main(String[] args) {

        Lab l = new Lab();
        int res = l.add(2, 6);
        String res1 = l.add("Praveen ", "Iyli");
        String res2 = l.add("Praveen ", 18);


        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);


    }
}

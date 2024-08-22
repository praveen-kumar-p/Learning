package ex_August.collectionFramwork;

import java.util.ArrayList;

public class Lab015 {
    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();
        mylist.add("Praveen");
        mylist.add("Pradeep");
        mylist.add(123);
        mylist.add("Prakash");
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.contains("Prakash"));
        System.out.println(mylist.get(2));


    }
}

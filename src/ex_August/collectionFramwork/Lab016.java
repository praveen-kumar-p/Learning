package ex_August.collectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class Lab016 {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("Praveen");
        l.add("Pradeep");
        l.add(123);
        l.add("Prakash");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("Prakash"));
        System.out.println(l.get(2));
        l.clear();
        System.out.println(l);
        System.out.println(l.isEmpty());

        l.add(18);
        l.add(true);
        System.out.println(l);

        for (Object o: l){
            System.out.println(o);
        }
    }
}

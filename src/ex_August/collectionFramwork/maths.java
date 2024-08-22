package ex_August.collectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maths {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(66);
        marks.add(85);
        marks.add(90);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks.reversed());

    }
}

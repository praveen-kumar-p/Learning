package ex_August.collectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Student {

    public static void main(String[] args) {
        member m1 = new member(4, "Praveen");
        member m2 = new member(2, "Harsha");
        member m3 = new member(1, "Shantha");
        member m4 = new member(3, "Rakshita");

        List m = new ArrayList();
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        System.out.println(m);
    }
}

class member{
    private Integer id;
    private String name;

    public member(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    }
//}
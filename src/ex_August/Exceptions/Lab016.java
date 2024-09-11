package ex_August.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab016 {

    public static void main(String[] args) {

        String path = "C://Users//0554//Documents//Amberilla";
        File f = new File(path);
        try {
            FileReader file = new FileReader(f);
        } catch (FileNotFoundException e) {
            System.out.println("File Testing");
        }
    }
}
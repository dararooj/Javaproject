package Exceptions;

import java.io.FileNotFoundException;

public class Arooj {
    void number(int no) throws FileNotFoundException {
        if (no < 18) {
            System.out.println("File is Found");
        } else {
            System.out.println("File is NOt Found");
        }
    }
}

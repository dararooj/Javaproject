package Exceptions;

public class SimpleProgram {
    void program(int age) {
        if (age < 18) {
            throw new ArithmeticException("person is not eligible");
        }
        else {
            System.out.println("person is eligible");
        }
    }
}

package Exceptions;

public class Divide {
    public static void main(String[] args) {
        arooj();
    }
    static void arooj(){
        try{
            int a=80;
            int b=0;
            int c=a/b;
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
    }
}


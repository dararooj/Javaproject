package Exceptions;

public class Multiply {
    public static void main(String[] args) throws Exception{
try{
    arooj();
}
catch (ArithmeticException ae){
    System.out.println(ae);
}
    }
   static void arooj() {
        int a = 10;
        int b = 0;
        int c = a * b;
        System.out.println(c);
    }
}
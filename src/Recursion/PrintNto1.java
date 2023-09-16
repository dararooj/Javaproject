package Recursion;

public class PrintNto1 {
  static   void numbers(int n){
        if (n==0){
            return;
        }
        else{
            System.out.println(n+" ");
            numbers(n-1);
        }
    }
}

package Recursion;

public class Recursion3 {
   static void fun3(int n) {
        if (n == 0) {
            return;
        } else {
            fun3(n / 2);
            System.out.print(n % 2+" ");
        }
    }
}

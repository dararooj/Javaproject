package Recursion;

public class Factorial {
    static int fac4(int n){
        if (n==0){
            return 1;
        }
        else {
            return n*fac4(n-1);
        }
    }
}

package Recursion;

public class Fibnacci {
    static int fac5(int n){
//        if(n==0) {
//            return 0;
//        }
//            if (n==1){
//                return 1;
//        }
        if (n<=1){
            return n;
        }
        else{
           return fac5(n-1)+fac5(n-2);
        }
    }
}

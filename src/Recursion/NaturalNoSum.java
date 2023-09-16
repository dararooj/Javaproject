package Recursion;

public class NaturalNoSum {
  static   int getsum(int n){
        if (n==0){
            return 0;
        }
        else{
          return n+getsum(n-1);
        }
    }
}

package Recursion;

public class SumOfDigits {
   static int sum(int n){
     if (n==0){
         return 0;
     }
     else{
         return sum(n/10)+n%10;
     }
    }
}

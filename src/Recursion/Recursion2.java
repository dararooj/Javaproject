package Recursion;

public class Recursion2 {
   static int fun2(int n){
      if(n==1){
          return 0;
      }
      else {
          return 1+fun2(n/2);
      }
    }
}

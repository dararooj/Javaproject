package Recursion;

public class Print1toN {
    static void numbers2(int n){
        if (n==0){
            return;
        }
        else{
            numbers2(n-1);
            System.out.println(n+" ");
        }
    }
}

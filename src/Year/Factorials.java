package Year;

public class Factorials {
    void factorial(){
        int n=5;
        int  fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

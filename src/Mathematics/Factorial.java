package Mathematics;

public class Factorial {
    void fact(){
        System.out.println("### factorial of a number###");
        int n=5;
        int  fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

package Mathematics;

public class CountDivisors {
    void divisors() {
        int n = 10;
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                System.out.print(" "+i);
            }
        }
    }
}

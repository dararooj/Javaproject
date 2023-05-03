package WithOutLoop;

public class NumberOneToN {
    void number(int n){
        if (n<=0){
            return;
        }
        else {
            number(n-1);
            System.out.println(n);
        }
    }
}

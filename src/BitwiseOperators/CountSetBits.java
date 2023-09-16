package BitwiseOperators;

public class CountSetBits {
    String countset(){
        int n=5;
        int k=3;
        int count = 0;
        while(n>0){
            if (n % 2 == 1){
                count++;
            n=n/2;
            }
        }
        return "count";
    }
}

package Mathematics;

public class CountDigits {
    int count(){
        int A =123;
        int res = 0;
       while (A > 0){
           A = A/10;
            res++;
        }
       return res;
    }
}

package Mathematics;

public class LCM {
    int lcm(int a, int b){
        System.out.println("%%% LCM of two numbers %%%");
        int res = Math.max(a,b);
        while(res>0){
            if (res % a ==0 && res % b == 0){
                break;
            }
            res++;
        }
        return res ;
    }
}

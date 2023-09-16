package Mathematics;

public class HCF {
    int hcf(int a,int b) {
        System.out.println("*** HCF of two numbers ***");
        int res = Math.min(a, b);
        while(res>0){
            if (a % res == 0 && b % res == 0){
               break;
            }
            res--;
        }
    return res;
    }
}

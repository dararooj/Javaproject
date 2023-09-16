package Mathematics;

public class TrailingZeros {
    void zeros(){
        System.out.println("### Trailing Zeros ###");
        int n = 5;
        int fact =1;
        int count =0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            while(fact%10==0){
                count++;
                fact = fact/10;
            }
        }
        System.out.println(count);
    }
}

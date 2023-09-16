package BitwiseOperators;

public class IsSet {
    void isset(int n,int k){
        System.out.println("###is set###");
        int x=1;
        for (int i=0;i<=(k-1);i++) {
            x = x * i;
            if ((x & i) != 0) {
                System.out.println("Kth element is set");
            } else {
                System.out.println("Kth element is not set");
            }
        }
    }
}

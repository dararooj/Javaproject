package Array;

import java.util.Arrays;

public class AscendingOrder {
    void ascendingorder(){
        int[] B={3,19,34,25,36};
        int temp=0;
        for (int i=0;i<B.length;i++){
            for (int j=i+1;j<B.length;j++){
                if (B[i]>B[j]){
                    temp=B[i];
                    B[i]=B[j];
                    B[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(B));

    }
}

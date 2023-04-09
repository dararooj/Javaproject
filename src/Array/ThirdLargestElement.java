package Array;

import java.util.Arrays;

public class ThirdLargestElement {
    void thirdlargestelement(int[] A){
       // int[] A={13,98,78,64,27};
        int temp=0;
        int len=A.length;
        for (int i=0;i< A.length;i++){
            for (int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                   temp=A[i];
                   A[i]=A[j];
                   A[j]=temp;
                }
            }
        }
       System.out.println(Arrays.toString(A));
        System.out.println(A[len-3]);
    }
}

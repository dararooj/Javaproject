package Array;

import java.util.Arrays;

public class MergeTwoArrays {
    void arrays(){
        int[] A={2,4,6,8};
        int[] B={1,3,5,7};
        int c_length=A.length+B.length;
        int[] C=new int[c_length];
        for (int i=0;i<=A.length-1;i++){
            C[i]=A[i];
        }
        for (int i=0;i<=B.length-1;i++) {
            C[A.length+i] = B[i];
        }
        for (int i=0;i<=C.length-1;i++)
        System.out.println(C[i]);
    }
}

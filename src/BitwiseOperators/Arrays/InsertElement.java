package BitwiseOperators.Arrays;

import java.util.Arrays;

public class InsertElement {
    void insert(){
        int[] A=new int[10];
        for (int i=1;i<=5;i++){
            A[i-1]=i;
        }
        System.out.println(Arrays.toString(A));
        int position=2;
        int element =8;
        for (int i=A.length-1;i>=position-1;i--){
            A[i]=A[i-1];
        }
        A[position-1]=element;
        System.out.println(Arrays.toString(A));
    }
}

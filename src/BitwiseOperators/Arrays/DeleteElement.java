package BitwiseOperators.Arrays;

import java.util.Arrays;

public class DeleteElement {
    void delete(){
        System.out.println("*** delete element ***");
        int[] A={10,20,30,40,50};
        int delete=20;
        for (int i=0;i<A.length;i++){
            if (delete==A[i]){
                for (int j=i;j<A.length-1;j++){
                    A[j]=A[j+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(A));
    }
}

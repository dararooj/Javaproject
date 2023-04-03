package Array;

public class LargestElement {
    void largestelement(){
        int[] A={23,45,19,20,37};
        int max=A[0];
        for (int i=1;i<A.length;i++){
           if(A[i]>max);
            max=A[i];
        }
        System.out.println(max);
    }
}

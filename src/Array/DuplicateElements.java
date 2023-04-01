package Array;

public class DuplicateElements {
    void duplicateelements(){
        int[] A={1,2,4,2,3,4,5,6,7,6,8};
        for (int i=1;i<A.length;i++){
            for(int j=i+1;j< A.length;j++){
                if (A[i]==A[j]){
                    System.out.print(A[i] + " ");
                }
            }
        }
    }
}

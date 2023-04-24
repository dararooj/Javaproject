package Array;

public class OccurenceOfANo {
    void occurenceano(){
        int[] A={1,2,3,2,4,5,2,2,6,7,3};
        for (int i=0;i<=A.length-1;i++) {
            for (int j = i + 1; j <= A.length - 1; j++) {
                if (A[i] == A[j]) {
                    System.out.print("no repeated is:" + A[i]);
                }
            }
            System.out.println();
        }
    }
}

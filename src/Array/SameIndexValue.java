package Array;
//print value equal to index value
public class SameIndexValue {
    void samevalue() {
        int[] A = {17, 12, 3, 8, 34};
        System.out.println("-------");
        for (int i = 0; i <= A.length-1; i++) {
            if (A[i] == i+1) {
                System.out.print(A[i]+" ");
            }
        }
        System.out.println();
    }
}

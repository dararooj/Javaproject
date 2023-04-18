package BasicPrograms;

import java.util.Arrays;

public class LargestAmongThree {
    void largestamongthree() {
        int[] A = {30, 29, 17};
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(A));
        System.out.println(A[A.length - 3]);
    }
}

package Matrix;

public class MatrixEqual {
    void matrixequal() {
        int[][] A = {{1, 3, 8}, {6, 9, 10}, {8, 4, 7}};
        int[][] B = {{1, 3, 8}, {8, 9, 10}, {8, 4, 7}};
        boolean isMatrix = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] != B[i][j]) {
                    isMatrix = false;
                }
            }
        }
        if (isMatrix) {
            System.out.println("matrix are equal");
        } else {
            System.out.println("is not a matrix");
        }
    }
}
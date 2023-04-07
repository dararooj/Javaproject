package Matrix;

public class AddTwoMatrix {
    void addtwomatrix() {
        int[][] A = {{1, 3, 4}, {3, 4, 2,}, {9, 8, 4}};
        int[][] B = {{1, 3, 4}, {3, 4, 2,}, {9, 8, 4}};
        int[][] C = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println();
    }
}

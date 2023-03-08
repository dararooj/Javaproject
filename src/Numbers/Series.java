package Numbers;

public class Series {
    void series() {
        int[] A = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        for (int i = 0; i <= 8; i++) {
            if (A[i]+A[i+1]==A[i+2]) {
                System.out.println( "A is a fibonaic Series");
            }
            else {
                System.out.println("A is not a fibonaic series");
            }
        }
    }

}
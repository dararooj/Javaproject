package Numbers;



public class Series {
    void series() {
        int[] A = {1, 2,3, 5,8,13,21,34,3};
        boolean isFibonacci=false;
//        int temp= A[i + 2];
        for (int i = 0; i <A.length-2; i++) {

            if (A[i] + A[i + 1] == A[i + 2]) {
//                System.out.println( "A is a fibonaic Series");
                isFibonacci = true;
            } else {
//                   System.out.println("A is not a fibonaic series");
                isFibonacci = false;
            }
        }
        if (isFibonacci==true){
            System.out.println("A is a fibonaic Series");
        }
        else {
            System.out.println("A is not a fibonaic series");
        }
    }
        }
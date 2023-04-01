package Array;

public class ReverseElements {
    void reverseelements(){
        int[] A={1,2,3,4,5,};
        for(int i=0;i<A.length;i++){
            System.out.println("original array" + A[i]);
        }
        for (int i=A.length-1;i>=0;i--){
            System.out.println("reverse array" + A[i]);
        }
    }
}

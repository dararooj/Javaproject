package Array;

public class EvenElements {
    void evenelements(){
        int[] A={1,2,3,4,5,6};
        for (int i=1;i<A.length;i=i+2){
            System.out.print(A[i]+" ");
        }
        System.out.println(" are even element ");
    }
}

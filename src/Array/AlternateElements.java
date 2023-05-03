package Array;
//print alternate elements of an array
public class AlternateElements {
    void alternateelements(){
        System.out.println("##########");
        int[] A={2,7,5,18,11,30};
        for(int i=0;i<=A.length-1;i+=2){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}

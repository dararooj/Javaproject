package Array;

public class MaxMinNumber {
    void maxminumber(){
        int[] A={5,6,23,16,32,12};
        int temp=0;
        for (int i=0;i<A.length;i++){
            for (int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j]){
                  temp=A[i];
                  A[i]=A[j];
                  A[j]=temp;
                }
            }
            System.out.print(A[i] + " " );
        }
        System.out.println("minimum element is:" + A[0]);
        System.out.println("miximum element is:" + A[A.length-1]);
    }
}

package Array;

public class SumElements {
    void sumelements(){
        int[] A={1,2,3,4,5,15};
        int Sum=0;
        for (int i=0;i< A.length;i++){
            Sum=Sum+A[i];
        }
        System.out.println(Sum);
    }
}

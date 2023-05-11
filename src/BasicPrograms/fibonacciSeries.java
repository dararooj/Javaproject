package BasicPrograms;
//java program to run the even sum of fibonacci series
public class fibonacciSeries {
    void fibonaicciseries(){
        int[] A = {1, 2,3, 5,8,13,21,34,55};
        int temp=0;
        for (int i=0;i<A.length;i++){
            if (A[i]%2==0){
               temp=temp+A[i];
            }
        }
        System.out.println(temp);
    }
}

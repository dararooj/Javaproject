package Array;

public class MissingNumber {
    void missingnumber() {
        int[] A = {1,2,3,5

        };
        int expected_no_elements=A.length;
         int total_sum=expected_no_elements*(expected_no_elements+1)/2;
        System.out.println(total_sum);
        int sum=0;
        for (int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println("missing no is: " + (total_sum-sum));
    }
    }

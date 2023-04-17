package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    void duplicateelements() {
        int[] A={1,3,2,3,4,5,4,6};
        Set<Integer> B=new HashSet<>();
        for(int i=0;i<A.length;i++){
            if (B.add(A[i])==false){
                System.out.println(A[i]);
            }
        }
    }
    }
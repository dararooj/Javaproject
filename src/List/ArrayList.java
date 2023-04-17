package List;

import java.util.*;

public class ArrayList {
    void arraylist(){
        List<Integer> A=new java.util.ArrayList<>();
        A.add(3);
        A.add(9);
        A.add(8);
        A.add(5);
        System.out.println(A);
        Iterator<Integer> B=A.iterator();
        System.out.println(B.next());
        while (B.hasNext()) {
            System.out.println(B.next());
        }
        Collections.sort(A);
        for (Integer number:A){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

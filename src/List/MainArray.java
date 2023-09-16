package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.*;
public class MainArray {
    public static void main(String[] args) {
     ArrayList2 AL2=new ArrayList2();
        AL2.arraylist2();
        ReverseList RL=new ReverseList();
        RL.reverselist();
        Queue<String> A=new LinkedList<>();
        A.add("books");
        Map<String,Integer> AA= new HashMap<>();
//        AA.put(A.poll(),1);
        List<String> list = new ArrayList<>(A);
        System.out.println("Printing objects of List " +list);
    }

}

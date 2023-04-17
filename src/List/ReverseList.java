package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    void reverselist(){
        List<String> L=new LinkedList<>();
        L.add("kaushal");
        L.add("arooj");
        L.add("bhatt");
        L.add("dar");
       Iterator<String> I = ((LinkedList<String>) L).descendingIterator();//??
        System.out.println(I.next());
        while (I.hasNext()){
            System.out.println(I.next());
        }
    }
}

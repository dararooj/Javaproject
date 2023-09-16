package Collections;
import java.util.Stack;
import java.util.Vector;

public class StackPrg {
    int stack(){
     Stack<Integer> m=new Stack<Integer>();
     m.push(9);
     m.push(8);
     m.push(5);
        System.out.println(m);
        System.out.println(m.empty());
        System.out.println(m.pop());
        System.out.println(m);
        m.push(2);
        m.push(4);
        m.push(3);
        System.out.println(m);
        System.out.println(m.peek());
        System.out.println(m);
        System.out.println(m.search(8));
        Vector<Integer> v =new Vector<>(m);
        System.out.println(v);
        v.add(12);
        v.add(13);
        System.out.println(v);
     return m.size();
    }
}

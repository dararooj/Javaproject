package Numbers;

public class SwapNumbers {
    void swaping(int a, int b) {
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println(a + " " + b);
    }

}
class Swap {
    void number(int a, int b){
          a=a+b;
          b=a-b;
          a=a-b;
        System.out.println(a + " " + b);
    }
}



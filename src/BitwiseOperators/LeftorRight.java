package BitwiseOperators;

public class LeftorRight {
    int notoperator(int x){
        System.out.println("### not operator ###");
        System.out.println(~x);
        System.out.println("###left shift###");
        System.out.println(x<<1);
        System.out.println(x<<3);
        System.out.println("###right shift###");
        System.out.println(x>>2);
        return 0;
    }
}

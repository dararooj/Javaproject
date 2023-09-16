package BitwiseOperators;

public class AndOperator {
    public static void main(String[] args) {
        int x=90; //1011010
        int y=70;  //1000110
        int z= x & y; //1000010,66
        System.out.println(z);
        int a=3;
        int b=6;
        int c= a | b;
        System.out.println(c);
        int x1=9;
        int y1=7;
        int z1= x1 ^ y1;
        System.out.println(z1);
        LeftorRight ll=new LeftorRight();
        ll.notoperator(9);
        IsSet is=new IsSet();
        is.isset(5,3);
        CountSetBits CSB = new CountSetBits();
        System.out.println(CSB.countset());
    }
}

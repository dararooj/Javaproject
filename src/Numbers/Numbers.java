package Numbers;

public class Numbers {
    public static void main(String[] args) {
        SwapNumbers SN=new SwapNumbers();
        SN.swaping(20,40);
        Swap S=new Swap();
        S.number(20,15);
        Fabinoic F=new Fabinoic();
        F.fabinoic(11);
        Evenodd EO=new Evenodd();
        EO.EvenOddNumber();
        int[] A={1, 2,3, 5,8,13,21,34};
        Series SS=new Series();
        SS.series(A);
        PalindromeNumber PN =new PalindromeNumber();
        PN.palindromenumber();
        ArmStrong AM=new ArmStrong();
        AM.armstrong();
    }
}



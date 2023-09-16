package Mathematics;

public class MainClass {
    public static void main(String[] args) {
        CountDigits CD = new CountDigits();
        System.out.println(CD.count());
        Palindrome P = new Palindrome();
        P.pal();
        Factorial F= new Factorial();
        F.fact();
        TrailingZeros TZ= new TrailingZeros();
        TZ.zeros();
        HCF hc = new HCF();
        System.out.println(hc.hcf(8,14));
        LCM lc =new LCM();
        System.out.println(lc.lcm(12,18));
        Prime PP = new Prime();
        System.out.println(PP.prime(11));
        CountDivisors cd = new CountDivisors();
        cd.divisors();
    }
}

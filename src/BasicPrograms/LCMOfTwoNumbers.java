package BasicPrograms;

public class LCMOfTwoNumbers {
    void numbers() {
        int a = 18;
        int b = 12;
        int hcf = 0;
        int lcm=0;
        int c;
        c = Math.min(a, b);
        for (int i = 1; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                lcm=(a*b)/hcf;
            }
        }
        System.out.println("lcm of a,b:" +lcm);
    }
}
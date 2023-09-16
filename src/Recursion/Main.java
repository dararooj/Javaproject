package Recursion;

import static Recursion.Factorial.fac4;
import static Recursion.Fibnacci.fac5;
import static Recursion.NaturalNoSum.getsum;
import static Recursion.Print1toN.numbers2;
import static Recursion.PrintNto1.numbers;
import static Recursion.Recursion1.fun1;
import static Recursion.Recursion2.fun2;
import static Recursion.Recursion3.fun3;
import static Recursion.SumOfDigits.sum;

public class Main {
    public static void main(String[] args) {
       fun1(3);
        System.out.println("****");
        System.out.println(fun2(16));
        System.out.println("////////");
        fun3(7);
        System.out.println("$$$$$");
        numbers(5);
        System.out.println("####");
        numbers2(5);
        System.out.println("%%%%%%%%");
        System.out.println(fac4(6));
        System.out.println("**********");
        System.out.println(fac5(5));
        System.out.println("#########");
        System.out.println(getsum(25));
        System.out.println("^^^^^^^^^^");
        System.out.println(sum(45));;
    }
}

package Array;
import java.util.*;
import java.io.PrintStream;
import java.util.ArrayList;

public class MissingNumber {
    public static void main(String[] args) {
        missingnumber();
    }

    static void missingnumber() {
        System.out.println("$$$$$$$$$$$");
        int[] A = {1, 2,4, 5, 6, 7, 9};
        int xor1 = A[0];
        for (int i = 1; i < A.length; i++) {
            xor1 = xor1 ^ A[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= (A.length + 1); i++) {
            xor2 = xor2 ^ i;
        }
        System.out.println("missing element is " + (xor1 ^ xor2));

    }
}

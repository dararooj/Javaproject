package BasicPrograms;

import java.util.Scanner;

//java program to read the number from standard input
public class NumbersFromStandaedInput {
    void number(){
        Scanner sc=new Scanner(System.in);
        double number;
        number=sc.nextDouble();
        System.out.println(" the number i received from command line as an standard input:" + number);
    }
}

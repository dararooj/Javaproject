package BasicPrograms;

import java.util.Scanner;

//java program to get input from a user
public class GetInputFromUser {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter input:");
    String str=sc.nextLine();
        System.out.println("You have entered: "+str);
    }

}


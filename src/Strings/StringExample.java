package Strings;

import java.util.Arrays;

public class StringExample {
    void  main(){
    String s1="java";
    char ch[]={'s','t','r','i','n','g','s'};
    String s2=new String(ch);
    String s3=new String("example");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
        System.out.println(s1.charAt(2));
        System.out.println(s2.length());
        System.out.println(s1.concat(s3));
        System.out.println(Arrays.toString(s2.split("i")));
}
}


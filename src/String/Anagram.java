package String;
import java.util.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    void anagram(){
        String name="nitin";
        boolean isName=false;
        char[] A= new char[name.length()];
        for (int i=0;i<name.length();i++){
            A[i]=name.charAt(i);
        }
        List<Character> rev=new ArrayList<Character>();
        for (int i=name.length()-1;i>=0;i--){
            rev.add(name.charAt(i));
        }
        // Collections.reverse(rev);
        System.out.println(Arrays.toString(A));
        System.out.println(rev);
        if (Arrays.toString(A).equals(rev.toString())){
            isName=true;
        }
        if (isName){
            System.out.println(name + "  is anagram");
        }
        else{
            System.out.println(name + " not is anagram");
        }
    }
}

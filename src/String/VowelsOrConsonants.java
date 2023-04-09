package String;
import java.util.*;

public class VowelsOrConsonants {
    void vowelconsonants() {
        String S = "apple is a fruit";
        int vcount=0,Vcount=0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' ||
                    S.charAt(i) == 'u') {
                vcount++;
            }
//            else if (S.charAt(i)>='a'|| S.charAt(i)>='z'){
            else if (S.charAt(i)!=(' ')){
                Vcount++;
            }
        }
        System.out.println("number of vowels: " + vcount);
        System.out.println("number of consonants: " + Vcount);
    }
}
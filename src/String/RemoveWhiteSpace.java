package String;

public class RemoveWhiteSpace {
    void removewhitespace(){
        String S="my name is arooj";
        S=S.replaceAll("\\s+", "");
        System.out.println(S);
    }
}

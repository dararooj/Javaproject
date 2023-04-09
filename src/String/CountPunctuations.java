package String;

public class CountPunctuations {
    void countpuncations() {
        String A = "https//www.'my name is: arooj'";
        int count=0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '!' || A.charAt(i) == ',' || A.charAt(i) == ';' || A.charAt(i) == '.' ||
                    A.charAt(i) == '?' || A.charAt(i) == '-' || A.charAt(i) == '\'' ||
                    A.charAt(i) == '/' || A.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println(count);
    }
}

package String;

public class Upper {
    void upper() {
        String A = "Apple Is a FRUIT";
        StringBuffer B = new StringBuffer(A);
        for (int i = 0; i < A.length(); i++) {
            if (Character.isLowerCase(A.charAt(i))) {
                B.setCharAt(i, Character.toUpperCase(A.charAt(i)));
            }
                 else if (Character.isUpperCase(A.charAt(i))){
                    B.setCharAt(i,Character.toLowerCase(A.charAt(i)) );
                }
            }
        System.out.println(B);
        }
        }

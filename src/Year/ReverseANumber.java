package Year;

public class ReverseANumber {
    void reverse(){
        int number=262626;
        int rev=0;
        int rem;
        while (number !=0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number=number/10;
        }
        System.out.println(rev);
    }
}

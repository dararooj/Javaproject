package Numbers;
public class PalindromeNumber {
    void palindromenumber(){
        int n=121;
        int m=0;
        int p;
        while(n>0){
            p=n%10;
            m=(m*10)+p;
            n=n/10;
        }
        if (n==m){
            System.out.println("n is a palindrome number");
        }
        else
            System.out.println("n is not a palindrome number");
    }
}

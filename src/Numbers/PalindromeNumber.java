package Numbers;
public class PalindromeNumber {
    void palindromenumber(){
        int n=121;
        int temp=n;
        int m=0;
        int p;
        while(n>0){
            p=n%10;//p=1,2,1
            m=(m*10)+p;//m=1,12,121
            n=n/10;//n=12,1,0
        }
        if (temp==m){
            System.out.println("n is a palindrome number");
        }
        else
            System.out.println("n is not a palindrome number");
    }
}

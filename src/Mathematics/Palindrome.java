package Mathematics;

public class Palindrome {
    void pal(){
        System.out.println("### Palindrome number###");
        int n= 343;
        int temp =n;
        int m=0;
        int p;
    while (n>0){
        p=n%10;
        m = (m*10)+p;
        n=n/10;
    }
    if (temp==m){
        System.out.println("n is a palindrome number");
    }
    else{
        System.out.println("n is not a palindrome number");
    }
}
}

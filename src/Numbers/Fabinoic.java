package Numbers;

public class Fabinoic {
    void fabinoic(int no){
        int a=0;
        int b=1;
        int c;
for (int i=1;i<=no;i++){
    c=a+b;
    System.out.print(c + " ");
    a=b;
    b=c;
}
    }
}

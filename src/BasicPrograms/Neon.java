package BasicPrograms;

public class Neon {
    void neon(int no){
        int sum=0;
        int square=no*no;
        while (square!=0) {
            sum = sum + square % 10;
            square = square / 10;
        }
            if (sum==no){
                System.out.println(no + " is neon");
            }
            else {
                System.out.println(no + " is not neon");
            }
    }
}

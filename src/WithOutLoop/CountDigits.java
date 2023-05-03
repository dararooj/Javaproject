package WithOutLoop;
//count digits in an integer
public class CountDigits {
    void count(){
        System.out.println("------------");
        int no=1390876;
        int count=0;
        while (no!=0) {
            no = no / 10;
            count++;
        }
            System.out.println(count);
    }
}
 
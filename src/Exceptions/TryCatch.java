package Exceptions;

public class TryCatch {
    int numbers(){
        try {
            int a=100;
            int b=0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(70);
        return 0;
    }
}

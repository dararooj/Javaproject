package BasicPrograms;

public class PrimeNumbers {
    void primenumbers(){
        int n=8;
        boolean prime=true;
        for (int i=1;i<n;i++){
            if (n%i==0){
                prime=false;
            }
        }
        System.out.println(prime);

    }
}

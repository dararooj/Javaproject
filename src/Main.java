public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Arrays a=new Arrays();
        a.arraysone();
    }
}
 class Arrays {
    void arraysone(){
        int[] A={3,2,5,4,1};
        int B=1;
        for(int i=0;i<=A.length;i++){
            if(A[i]==B){
                System.out.println(" element is present at index "+i+" ");
            }
        }
    }
}

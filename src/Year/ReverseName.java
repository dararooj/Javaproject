package Year;

public class ReverseName {
    void reversename(){
     String name="my name is arooj";

        String[] A=name.split(" ");
     String rev="";
     for (int i= A.length-1;i>=0;i--){
         rev=rev+A[i]+" ";
     }
        System.out.println(rev);
    }
}

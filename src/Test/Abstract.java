package Test;

import java.util.ArrayList;

abstract class Abstract {
     abstract  void Azmat();




     void Arooj(){
        System.out.println("my name is arooj");
    }
}
class B extends Abstract{
    @Override
    void Azmat() {

    }

    void  Arooj(){
         System.out.println("my name is kaushal");
     }

}
class C{
     public static void main(String[] args){
         int[] a={1,2,3,4,5,};
         ArrayList<Integer> A= new ArrayList<Integer>();
//       B name=new B();
//       name.Arooj();
       String name="Arooj";
       String car="pink";
       String AB=new String("Arooj");
       name="kaushal";
       AB="Azmat";
         System.out.println(name);
         System.out.println(AB);
     }
}

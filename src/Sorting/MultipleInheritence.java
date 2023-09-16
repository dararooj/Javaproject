package Sorting;

public class MultipleInheritence implements animals,Books{

   public void a(){
        System.out.println("arooj");
    }
}
interface animals{
    static int x=3;
}
interface  trees{
 final int y=9;
}
interface Books{
    void a();
    final int z=6;
}

interface copies extends Books{
 int run();
}

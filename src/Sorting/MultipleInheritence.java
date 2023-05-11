package Sorting;

public class MultipleInheritence implements animals{
    public static void main(String[] args) {
        System.out.println("hi");
    }
}
interface animals{
    static int x=3;
}
interface  trees{
 final int y=9;
}
interface Books{
abstract void a();
    final int z=6;
}

interface copies extends Books{
abstract int run();
}

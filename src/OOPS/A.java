package OOPS;

public class A {
  //void books(){
        int copy=3;
   // }
}
class B extends A{
    void books(){
        int copy=6;
        System.out.println(copy);
        System.out.println(super.copy);
        System.out.println(this.copy);
    }
}

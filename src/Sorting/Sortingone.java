package Sorting;

import java.util.Arrays;

public class Sortingone {
        void sortingone() {
            int[] a = {19, 20, 14, 17, 22};
            int b;
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[j] < a[i]) {
                        b = a[j];
                        a[j] = a[i];
                        a[i] = b;

                    }
                }

            }
            System.out.println(Arrays.toString(a));
        }
        interface Dog{

        }
class Animals implements Dog {
            void animals(){
                String colour="black";
            }
}
    }
//multipleinheritance: In multipleinheritance, one or more than one class inherits the properties of same class
// abstract class  Fruits{
//    void fruit(int a,int b){
//
//    }
//class D extends Fruits{
//        void fruit()
//    }
//}
//class A{
//    Fruits f=new Fruits();
//}
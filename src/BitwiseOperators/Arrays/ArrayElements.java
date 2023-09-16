package BitwiseOperators.Arrays;

import java.util.Arrays;

public class ArrayElements {
   void element(){
        int[] C= new int[10];
        C[0]=1;
        C[1]=2;
        C[3]=9;
        int n = C.length;//size
        int capacity=C.length;
        int postion;
        int x =2;//element to insert
//        int[] newArr = new int[n+1];
//        int value = 7;
//        System.out.println(Arrays.toString(C));
//        for(int i = 0; i<n; i++) {
//            newArr[i] = C[i];
//        }
//        newArr[n] = value;
//        System.out.println(Arrays.toString(newArr));
        if (n==capacity){
            System.out.println(n);
        }
        else{
            int index =3;
            for (int i=n-1;i>=index;i--){
                C[i+1]=C[i];
                C[index]=x;
            }
            System.out.println(C);
        }
    }
}

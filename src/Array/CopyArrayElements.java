package Array;

public class CopyArrayElements {
    void copyelements(){
        int[] array1={1,2,3,4,5};
        int[] array2=new int[array1.length];
        for (int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }
        for (int i=0;i<array1.length;i++){
            System.out.println("Elements of array1:" + array1[i]);
        }
        for (int i=0;i<array2.length;i++){
            System.out.println("Elements of array2:"+array2[i]);
        }
    }
}

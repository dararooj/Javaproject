package Sorting;

public class SortingTwo {
    void sortingtwo(){
    int[] a = {19, 20, 14, 17, 22};
    int b;
    int c = 0;
        for (int i = 0; i < a.length; i++) {
        b = i;
        for (int j = i+1; j < a.length; j++) {
            if (a[j] < a[b]) {
                b = j;
            }
        }
        c = a[i];
        a[i] = a[b];
        a[b] = c;
        System.out.println(a[i]);
    }
}
}



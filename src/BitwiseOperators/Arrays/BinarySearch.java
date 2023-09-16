package BitwiseOperators.Arrays;

public class BinarySearch {
    int bsearch(){
        System.out.println("########");
        int[] a={12,14,15,18,19};
        int n=a.length-1;
        int x=18;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (a[mid]==x){
                return mid;
            } else if (a[mid]>x) {
              high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return  low;
    }
}

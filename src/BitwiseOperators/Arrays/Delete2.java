package BitwiseOperators.Arrays;

public class Delete2 {
    int deletemethod(int n,int x) {
        int[] arr={1,2,3,4,5};
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
            if (i == n) {
                return n;
            }
            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

        }
        return n+1;
    }
}

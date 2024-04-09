import java.util.Arrays;

public class ReverseArray {

    public static void main(String args[]) {
        int a[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(reverse(a)));
    }

    static int[] reverse(int a[]) {
        int last = a.length - 1;
        int first = 0;
        while (first < last) {
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
        return a;
    }
}

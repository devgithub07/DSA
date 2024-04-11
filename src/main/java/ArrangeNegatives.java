import java.util.Arrays;

public class ArrangeNegatives {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,-5,-6,-7,8,9,44,55,-8};
        int index=0;
        int j=0;
        for(index=0;index<a.length;index++){
            if(a[index]<0){
                int temp=a[j];
                a[j]=a[index];
                a[index]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

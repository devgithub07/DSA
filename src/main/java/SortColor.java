import java.util.Arrays;

public class SortColor {
    public static void main(String args[]){

        int a[] = {1,1,0,1,2,0,1,2,0,1,2,1,1};
        System.out.println(a.length);
        int left =0;
        int right =a.length-1;
        int temp;
        for(int index=0;index<right;)
        {
            if(a[index]==0)
            {
                temp=a[left];
                a[left]=a[index];
                a[index]=temp;
                left++;
                index++;

            }
            else if (a[index]==2){
                temp=a[right];
                a[right]=a[index];
                a[index]=temp;
                right--;

            }
            else
                index++;
        }

        System.out.println(Arrays.toString(a));
    }
}

public class ShiftArray {

    public static void main(String[] args) {
        int a[] ={10,20,30,40,50,60,70,80,90};
        int b[] = new int[a.length];

        int k=5;
        int l=  a.length;
        for(int j=0;j<a.length;j++)
        {
            b[(j+k)%l] = a[j];

        }
        for(int j=0;j<l;j++)
            System.out.println(b[j]);
    }
}

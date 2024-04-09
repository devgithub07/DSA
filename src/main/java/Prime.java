public class Prime {

    public static void main(String args[]) {

        System.out.println(prime(5));
        System.out.println(prime(25));
        System.out.println(prime(72));


    }

    static boolean prime(int n) {

        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }
}

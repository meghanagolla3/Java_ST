package Math;

public class addDigits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(ans(n));
    }

    private static int ans(int n) {

        while(n>0){
            int a = n / 10;
            int b = n % 10;
            n = a + b;
            if(n / 10 == 0){
                return n;
            }
        }
        if(n == 0){
            return 0;
        }
        return n;
    }
}

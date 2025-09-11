package Recursion;

public class powerOfn {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        System.out.println(ans( x, n));
    }

    private static double ans(double x, int n) {
        if(n == 0){
            return 1;
        }else{
            double ans = x * ans(x, n-1);
            return ans ;
        }
    }
}

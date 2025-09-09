package Recursion;

public class sumOfn {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int sum =0;
        System.out.println(myPow(2.00000,10));
    }

    private static double myPow(double x,int n) {
        double ans;
        if(n == 0){
            return 1;

        }else{

//            ans = ans*n;
            ans = myPow(x,n-1);
            return x * ans;
//            return x * myPow(x,n-1);
        }

    }
}

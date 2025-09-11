package Recursion;

public class Intro {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        ans(arr,0,n);
        int n1 = 8;
        ans1(n1);
    }

    private static void ans1(int n) {
        if(n == 0){
            return ;
        }

        ans1(n/2);

        System.out.println(n);
        ans1(n/2);

    }


    private static void ans(int[] arr,int idx, int length) {
//        if(idx == length){
//            return;
//        }
//        System.out.println(arr[idx]);
//        ans(arr, idx+1, length);
    }

}
// A function that calls itself directly or indirectly
//base case
//should some task
//change in parameters with function
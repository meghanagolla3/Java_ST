package Recursion;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
//        int idx;
        ans(arr,0,n);
    }

    private static void ans(int[] arr, int idx, int n) {
        if(idx == n){
            return;
        }
        ans(arr, idx+1, n);
        System.out.println(arr[idx]);
    }

}

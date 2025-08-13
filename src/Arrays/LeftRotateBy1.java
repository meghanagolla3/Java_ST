package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        ans(arr);
        System.out.println(Arrays.toString(ans2(arr,2)));
    }

    private static int[] ans1(int[] arr, int k) {
        for (int i = 1; i <k; i++) {
            ans(arr);
        }
        return arr;
    }

    private static void ans(int[] arr) {

        for(int i=0; i< arr.length-1;i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

    }
    public static int[] ans2(int[] arr, int k){
        reverse(arr, 0,k-1);
        reverse(arr,k+1-1,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }

    public static void reverse(int[] arr,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}

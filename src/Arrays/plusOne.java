package Arrays;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(ans(arr)));
    }

    private static int[] ans(int[] arr) {
        int n = arr.length-1;
        for(int i=0; i< arr.length;i++){
            if(arr[i]== arr[n]) {
                arr[n]= arr[arr.length - 1] + 1;
            }
        }
        return arr;
    }
}

package Arrays;

import java.util.Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int x= arr[0];
        for(int i=1; i<arr.length; i++){
            x = x^arr[i];
        }
        return x;
    }
}

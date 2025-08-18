package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {3,2,4};
        System.out.println(Arrays.toString(ans(arr,6)));
    }

    private static int[] ans(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        while(start < end){
            if(arr[start] + arr[end] ==target){
                 return new int[]{start,end};
            }else if(arr[start] + arr[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}

package Arrays;

import java.util.Arrays;

import static java.lang.Integer.reverse;

public class LeadersOfArray {
    public static void main(String[] args) {
        int[] arr= {7,10,4,3,6,5,2};
        int j= arr.length-1;
        System.out.println(arr[arr.length-1]);
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[j] < arr[i]) {
                arr[j] = arr[i];
            }
        }


    }
}

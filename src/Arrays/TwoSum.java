package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {2,5,5,11};
        System.out.println(Arrays.toString(ans(arr,10)));
    }

    private static int[] ans(int[] arr, int target) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]+arr[j-i]==target){
                    return new int[]{j-i,j};
                }
            }
        }
        return new int[]{};
    }
}

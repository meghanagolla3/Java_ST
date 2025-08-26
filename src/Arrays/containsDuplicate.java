package Arrays;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        Arrays.sort(arr);
        System.out.println(ans(arr));
    }

    private static boolean ans(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}

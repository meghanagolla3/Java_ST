package Arrays;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3,4,4,5,5,6,6,6};
//        System.out.println(Arrays.toString(ans(arr)));
        System.out.println(Arrays.toString(ans(arr)));
    }


    private static int[] ans(int[] arr) {
        int idx = 1;


        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[idx] = arr[i];
                idx++;
            }
        }
//         return idx;
        int[] arr2 =new int[idx];
        for(int i=0;i<idx;i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }
}

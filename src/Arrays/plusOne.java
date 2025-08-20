package Arrays;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
//        ans(arr);
        System.out.println(Arrays.toString(ans(arr)));
    }


    public static int[] ans(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] <9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] arr1= new int[arr.length+1];
        arr1[0]=1;
        return arr1;
    }



}

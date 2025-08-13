package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        for(int i=start;i<=end;i++){
            if(start<end ){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            start ++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}

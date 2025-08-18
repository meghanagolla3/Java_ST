package Arrays;

import java.util.Arrays;

public class missingNum {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        Arrays.sort(arr);

        int i=0;
        while(i<arr.length){
            if(i==arr[i]){
                i++;
            }else{
                break;
            }
        }
        return i;
    }
}

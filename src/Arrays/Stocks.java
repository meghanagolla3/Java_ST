package Arrays;

public class Stocks {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int min= arr[0];
        int max =0;
        for(int i=1; i< arr.length-1; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]-min);
        }
        return max;
    }

}

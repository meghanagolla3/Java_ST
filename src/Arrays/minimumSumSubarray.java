package Arrays;

public class minimumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(ans(arr,7));
    }

    private static int ans(int[] arr, int target) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min_window = Integer.MAX_VALUE;
        int length=Integer.MAX_VALUE;
        while(right < arr.length){
            sum += arr[right];
            while(sum >= target){
                length = right -left +1;
                min_window = Math.min(length, min_window);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        if(min_window == Integer.MAX_VALUE) return 0;
        return min_window;

    }

}

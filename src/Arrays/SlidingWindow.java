package Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr={5, 2, -1, 0, 3};
        System.out.println(ans(arr,3));
    }

    private static int ans(int[] arr,int k) {

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum+=arr[j];
            }
            maxSum= Math.max(sum, maxSum);
        }

        return maxSum;
    }

}

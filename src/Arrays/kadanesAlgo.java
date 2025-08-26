package Arrays;

public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i ; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}

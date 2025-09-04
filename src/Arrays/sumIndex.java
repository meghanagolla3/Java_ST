package Arrays;

import java.util.Arrays;

class sumIndex {
    public static void main(String[] args) {
        int[] arr = {2,7,9,10};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[] {left+1, right+1};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
}

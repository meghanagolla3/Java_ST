package Arrays;

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(ans(arr));
    }


    public static void reverse(int[] arr,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    private static boolean ans(int[] arr) {
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                k++;
            }
        }
        reverse(arr,0, k-1+1);
        reverse(arr, k+1, arr.length-1);
        reverse(arr,0, arr.length-1);

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
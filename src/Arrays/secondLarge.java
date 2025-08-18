package Arrays;

public class secondLarge {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int firstMax =-1;
        int secondMax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstMax){
                firstMax = arr[i];
            }
        }
        for (int i=0; i< arr.length;i++){
            if(arr[i]>secondMax && arr[i]!= firstMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}

package Arrays;

public class subArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        for(int i=0; i< arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int idx=i; idx<=j;idx++){
                    System.out.print(arr[idx]);
                }
                System.out.println();
            }

        }
    }
}

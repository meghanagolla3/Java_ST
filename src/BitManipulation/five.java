package BitManipulation;

public class five {
    public static int oddOccurrence(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length-1; i++){

            if(arr[i] == arr[i+1]){
                count++;
            }
            arr[i]=arr[i+1];
            if(count%2!=0) {
                System.out.println(arr[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1};
        System.out.println(oddOccurrence(arr));
    }
}

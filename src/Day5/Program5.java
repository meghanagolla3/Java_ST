package Day5;

public class Program5 {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 7, -3, 9};
        int sum = 0;
        int count = 0;
        float avg ;
        for(int i =0; i< arr.length; i++){
            if(arr[i] > 0){
                 sum = sum + arr[i];
                 count++;
            }
        }
        avg = sum/count;
        System.out.println(avg);
    }
}

package Day5;

public class Program7 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 10, 12};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 3 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

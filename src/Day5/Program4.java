package Day5;

public class Program4 {
    public static void main(String[] args) {
        int x= 25;
        int[] arr = {10, 30, 20, 40, 50};
        System.out.print("Elements Greater than 25:");
        for(int i =0; i< arr.length; i++){
            if(arr[i] > x){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

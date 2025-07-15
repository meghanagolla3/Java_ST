package Day5;

public class Program3 {
    public static void main(String[] args) {
        int[] arr ={101, 100, 45, 89, 76};
        for(int i=0; i<arr.length-1; i++){

            if(arr[i] > arr[i+1]){
//                arr[i+1] = arr[i];
                System.out.println(arr[i]);
                if(arr[i] % 2 == 0) System.out.println("Even");
                else System.out.println("Odd");
                return;
            }


        }
    }
}

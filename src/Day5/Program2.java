package Day5;

public class Program2 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int i = 0;
        int count = 0;
        while(i<arr.length){
            if(arr[i]%2 != 0){
                count++;
                System.out.print(arr[i] +" ");
            }
            i++;

        }
        System.out.println();
        System.out.println(count);

    }
}

package Day5;

import java.util.Scanner;

public class Program1 {
    public static void evenSum(int[] arr){
        int sum = 0;
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("Enter the Array: ");
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        evenSum(arr);
    }
}

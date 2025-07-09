package Day1;

import java.util.*;

public class Functions1 {
    public static void greetUser(String name){
        System.out.println("Hello "+name+", Welcome to ST!");
    }
    public static void changeValue(int x){
        x = 100;
        System.out.println("Value inside the function: "+x);
    }
    public static void modifyArray(int[] arr){
        arr[0] = 99;
        System.out.println("Inside the function:");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i= 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr));
            return;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        greetUser("Meghana");
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Original Value before the function call: "+x);
//        changeValue(x);
//        System.out.println("Original Value after the function call: "+x);

//        System.out.println("Enter the Format: ");
//        int n =sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr ={1,2,3};
        System.out.println("Before function call: ");
        printArray(arr);
        modifyArray(arr);
        System.out.println("After function call: ");
        printArray(arr);
    }
}

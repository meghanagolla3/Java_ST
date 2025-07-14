package Day4;

import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n = sc.nextInt();
        System.out.println("Binary: "+Integer.toBinaryString(n));
        n = ~n;
        System.out.println("~5: "+n);
        System.out.println("Binary of ~5: "+Integer.toBinaryString(n));
    }
}

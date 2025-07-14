package Day4;

import java.util.Scanner;

public class SignedandUnsigned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n = sc.nextInt();

        System.out.println("Signed: "+(n>>2));
        System.out.println("Unsigned: "+(n>>>2));
    }
}

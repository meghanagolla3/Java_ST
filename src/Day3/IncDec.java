package Day3;

import java.util.Scanner;

public class IncDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n = sc.nextInt();

        System.out.println("Post Increment: "+(n++));
        System.out.println("pre Increment: "+(++n));
        System.out.println("Post Decrement: "+(n--));
        System.out.println("Pre Decrement: "+(--n));
    }
}

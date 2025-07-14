package Day3;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n = sc.nextInt();
        String temp = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(temp);
    }
}

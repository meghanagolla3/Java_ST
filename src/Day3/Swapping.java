package Day3;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}

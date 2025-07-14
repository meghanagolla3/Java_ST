package Day3;

import java.util.Scanner;

public class AreaandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int Length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int Breadth = sc.nextInt();

        int Area = Length * Breadth;
        int Perimeter = 2 * (Length + Breadth);
        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+Perimeter);
    }
}

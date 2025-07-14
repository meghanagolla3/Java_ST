package Day3;

import java.util.Scanner;

public class OperatorsEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        //Arithmetic Operators
        System.out.println("Addition: "+(x+y));
        System.out.println("Subtraction: "+(x-y));
        System.out.println("Division: "+(x/y));
        System.out.println("Modulo: "+(x%y));
        System.out.println("Multiplication: "+(x*y));
        //Relational Operators
        System.out.println("Greater Than: "+(x>y));
        System.out.println("Less Than: "+(x<y));
        System.out.println("Equals To: "+(x==y));
        //Logical Operators
        System.out.println("Logical AND: "+(x>5 && y<10));
        System.out.println("Logical OR: "+(x>10 || y<10));
        //Bitwise Operators
        System.out.println("Bitwise AND: "+(x&y));
        System.out.println("Bitwise OR: "+(x|y));
        System.out.println("Bitwise XOR: "+(x^y));
        System.out.println("Bitwise right shift: "+(x>>1));
        System.out.println("Bitwise left shift: "+(x<<1));
        System.out.println("Bitwise signed right shift: "+(x>>>y));
    }
}

package Day4;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        float f = sc.nextFloat();

        int i = (int)f;
        byte b = (byte)f;
        System.out.println("To int: "+i);
        System.out.println("To byte: "+b);
    }
}

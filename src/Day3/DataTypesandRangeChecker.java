package Day3;

import java.util.Scanner;

public class DataTypesandRangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Byte Value: ");
        byte b = sc.nextByte();
        System.out.print("Enter Short Value: ");
        short s = sc.nextShort();
        System.out.print("Enter Integer Value: ");
        int i = sc.nextInt();
        System.out.print("Enter Long Value: ");
        long l = sc.nextLong();
        System.out.print("Enter Float Value: ");
        float f = sc.nextFloat();
        System.out.print("Enter Double Value: ");
        double d = sc.nextDouble();

        System.out.println("Byte: "+b+", Range:"+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("Short: "+s+", Range:"+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("Integer: "+i+", Range:"+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Long: "+b+", Range:"+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("Float: "+f+", Range:"+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("Double: "+d+", Range:"+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
    }

}

package Day3;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius = ");
        double c = sc.nextDouble();
        double f = (c * 9/5)+ 32;

        System.out.println("Fahrenheit = "+f);
    }
}

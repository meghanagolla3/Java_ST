package Day1;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter cgpa");
        float cgpa = sc.nextFloat();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("CGPA: " +cgpa);
    }
}

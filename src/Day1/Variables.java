package Day1;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float cgpa = sc.nextFloat();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("CGPA: " +cgpa);
    }
}

package javaprogramme;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers. Eg. sum of 10 and 11 is 101
 */

public class Programme16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first binary number:");
        String x = input.next();
        System.out.println("Enter second binary number:");
        String y = input.next();

        int a = Integer.parseInt(x, 2);
        int b = Integer.parseInt(y, 2);
        int c = a + b;

        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(c));

        input.close();
    }

}

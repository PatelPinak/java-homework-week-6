package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 */

public class Programme17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        int x = input.nextInt();

        System.out.println("Decimal number converted to binary number: " + Integer.toBinaryString(x));

        input.close();

    }
}

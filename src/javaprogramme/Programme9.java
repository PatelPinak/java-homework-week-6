package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 *
 */

public class Programme9 {

    public static void main(String[] args) {
        String inputA;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabetical input in UPPER CASE:");
        inputA = scanner.nextLine();

        String inputB = inputA.toLowerCase();
        System.out.println("The result in lower case = " + inputB);

        scanner.close();

    }
}

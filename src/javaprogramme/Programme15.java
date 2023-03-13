package javaprogramme;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */

public class Programme15 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first value:");
        a = input.nextInt();

        System.out.println("Input the second value");
        b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Swapped values are first = " + a + " and second = " + b);

        input.close();
    }
}

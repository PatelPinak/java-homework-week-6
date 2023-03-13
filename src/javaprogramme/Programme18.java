package javaprogramme;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Programme18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input first value:");
        int a = input.nextInt();

        System.out.println("Please input second value:");
        int b = input.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " x " + b + " = " + (a*b));
        System.out.println(a + " ÷ " + b + " = " + (a/b));
        System.out.println(a + " mod " + b + " = " + (a%b));

        input.close();
    }
}

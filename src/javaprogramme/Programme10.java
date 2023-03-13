package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its  multiplication table up to 10.
 */

public class Programme10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a value to generate multiplication table up to 10:");
        int a = input.nextInt();
        System.out.println(a + " x 1 = " + (a*1));
        System.out.println(a + " x 2 = " + (a*2));
        System.out.println(a + " x 3 = " + (a*3));
        System.out.println(a + " x 4 = " + (a*4));
        System.out.println(a + " x 5 = " + (a*5));
        System.out.println(a + " x 6 = " + (a*6));
        System.out.println(a + " x 7 = " + (a*7));
        System.out.println(a + " x 8 = " + (a*8));
        System.out.println(a + " x 9 = " + (a*9));
        System.out.println(a + " x 10 = " + (a*10));

        input.close();

    }
}

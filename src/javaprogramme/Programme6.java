package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius value and press Enter key :");
        double radius = scanner.nextDouble();
        System.out.println("Area is = " + (Math.PI * radius * radius));

        scanner.close();
    }

}

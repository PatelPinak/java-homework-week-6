package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle
 */

public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the Triable:");
        double height = scanner.nextDouble();

        double area = (width * height)/2;
        System.out.println("Area of the Triangle is " + area);

        scanner.close();
    }
}

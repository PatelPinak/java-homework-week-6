package javaprogramme;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle. Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14 {

    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the width:");
        double width = input.nextDouble();
        System.out.println("Input the height");
        double height = input.nextDouble();

        double area = (width * height);
        System.out.println("Area of the Rectangle is " + width + " * " + height + " = " + df.format(area));

        double perimeter = 2 * (width + height);
        System.out.println("Perimeter of the Rectangle is 2 * (" + width + " + " + height + ") = " + df.format(perimeter));

        input.close();

    }
}

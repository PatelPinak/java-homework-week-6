package javaprogramme;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
 */

public class Programme7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Fahrenheit degree:");
        float fahrentheit = scanner.nextFloat();
        float celsius = (float) ((5 * (fahrentheit - 32.0)) / 9.0);
        System.out.println(fahrentheit + " degree Fahrenheit id equal to " + celsius + " in celsius");

        scanner.close();

    }

}

package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.
 */

public class Programme13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first value:");
        Double a = input.nextDouble();
        System.out.println("Input the second value:");
        Double b = input.nextDouble();
        System.out.println("Input the third value:");
        Double c = input.nextDouble();

        System.out.println("Average of the three value is " + average(a,b,c));

        input.close();
    }

    private static Double average(Double a, Double b, Double c) {
        return (a+b+c)/3;
    }

}

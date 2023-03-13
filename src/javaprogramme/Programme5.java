package javaprogramme;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication and division methods
 * all with parameters and use string concatenation  methods.(Note: Two static and Two instance methods.)
 */

public class Programme5 {

    public static void main(String[] args) {
        addition(20,10);
        subtraction(20, 10);
        Programme5 aplha = new Programme5();
        aplha.multiplication(20, 10);
        Programme5 beta = new Programme5();
        beta.division(20, 10);

    }
    public static void addition (int a, int b){
        System.out.println("Addition : 20 + 10 = " + (a+b));
    }
    public static void subtraction (int a, int b){
        System.out.println("Subtraction : 20 - 10 = " + (a-b));
    }

    public void multiplication (int a, int b){
        System.out.println("Multiplication : 20 x 10 = " + (a * b));
    }
    public void division (int a, int b){
        System.out.println("Division : 20 ÷ 10 = " + (a / b));
    }

}

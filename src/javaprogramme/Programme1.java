package javaprogramme;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Programme1 {
    int a = 15;
    int b = 12;

    public static void main(String[] args) {
        Programme1 alpa = new Programme1();
        alpa.myMethod();
    }

    public void myMethod() {
        System.out.println(a + b);
    }
}

package javaprogramme;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3 {
    int a = 35;
    static int b = 15;

    public static void main(String[] args) {
        Programme3 alpa = new Programme3();
        alpa.myMethod1();
        myMethod2();
    }

    public void myMethod1() {
        System.out.println(a);

    }

    public static void myMethod2() {
        System.out.println(b);
    }

}

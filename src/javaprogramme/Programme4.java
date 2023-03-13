package javaprogramme;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {

    int a = 35;
    int b = 25;
    static String nameA = "Prime ";
    static String nameB = "Testing";


    public static void main(String[] args) {
        Programme4 alpha = new Programme4();
        alpha.addition();
        learning();

    }

    public void addition() {
        int ans = a +b;
        System.out.println(ans);
    }

    public static void learning() {
        System.out.println(nameA + nameB);
    }


}

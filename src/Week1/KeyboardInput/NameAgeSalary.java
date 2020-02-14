package Week1.KeyboardInput;

import java.util.Locale;
import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = scanner.nextLine();

        System.out.printf("\nHi, %s!  How old are you?\n", name);
        int age = scanner.nextInt();

        System.out.printf("\nSo you're %d, eh?  That's not old at all!\n" +
                "How much do you make, %s?\n", age, name);
        float wage = scanner.nextFloat();

        System.out.printf(Locale.CANADA, "\n%.1f!  I hope that's per hour and not per year! LOL!", wage);
    }
}

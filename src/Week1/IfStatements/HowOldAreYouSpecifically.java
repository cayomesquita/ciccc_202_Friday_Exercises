package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = scanner.nextLine();
        System.out.printf("Ok, %s, how old are you? ", name);
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.printf("You can't drive, %s", name);
        } else if (age < 18) {
            System.out.printf("You can drive but not vote, %s", name);
        } else if (age < 25) {
            System.out.printf("You can vote but not rent a car, %s", name);
        } else {
            System.out.printf("You can do pretty much anything, %s", name);
        }
    }
}

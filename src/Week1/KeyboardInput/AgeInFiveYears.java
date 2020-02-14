package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("\nHi, %s!  How old are you? ", name);
        int age = scanner.nextInt();

        System.out.printf("\nDid you know that in five years you will be %d years old?\n" +
                "And five years ago you were %d! Imagine that!", age + 5, age - 5);
    }
}

package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Count to: ");
        int limit = scanner.nextInt();
        for (int i = 0; i <= limit; i++) {
            System.out.printf("%d ", i);
        }
    }
}

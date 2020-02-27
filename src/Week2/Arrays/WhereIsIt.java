package Week2.Arrays;

import java.util.Scanner;

public class WhereIsIt {
    private final static int ARRAY_LENGTH = 10;
    public static final int LIMIT_RANDOM = 50;

    public static void main(String[] args) {
        int[] arr1 = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr1[i] = generateRandom();
        }

        System.out.print("Array1: ");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("Value to find: ");
        try (Scanner scan = new Scanner(System.in)) {
            int input = scan.nextInt();

            System.out.println();

            boolean found = false;

            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (arr1[i] == input) {
                    System.out.printf("%d is in slot %d.\n", input, i);
                    found = true;
                }
            }

            if (!found) {
                System.out.printf("%d is not in the array.", input);
                ;
            }
        }

    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}

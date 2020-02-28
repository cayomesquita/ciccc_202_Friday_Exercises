package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class WhereIsIt {

    private final static int ARRAY_LENGTH = 10;
    public static final int LIMIT_RANDOM = 50;

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(ARRAY_LENGTH);

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array.add(generateRandom());
        }

        String arrayStr = array.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("ArrayList: " + arrayStr);

        System.out.print("Value to find: ");
        try (Scanner scan = new Scanner(System.in)) {
            int input = scan.nextInt();

            System.out.println();

            boolean found = false;

            for (int i = 0; i < array.size(); i++) {
                Integer num = array.get(i);
                if (num.equals(input)) {
                    System.out.printf("%d is in slot %d.\n", num, i);
                    found = true;
                }
            }

            if (!found) {
                System.out.printf("%d is not in the ArrayList.\n", input);
            }
        }
    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}


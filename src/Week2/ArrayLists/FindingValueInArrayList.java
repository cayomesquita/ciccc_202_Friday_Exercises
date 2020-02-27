package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class FindingValueInArrayList {

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

            array.stream()
                    .mapToInt(Integer::intValue)
                    .filter(num -> num == input)
                    .findAny()
                    .ifPresent(num -> System.out.printf("%d is in the ArrayList.", num));
        }
    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}

package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GettingTheLargestValue {

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

        array.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(num -> System.out.printf("The largest value is %d\n", num));

    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}
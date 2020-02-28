package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class LocatingTheLargestValue {

    private final static int ARRAY_LENGTH = 10;
    public static final int LIMIT_RANDOM = 100;

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(ARRAY_LENGTH);

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array.add(generateRandom());
        }

        String arrayStr = array.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("ArrayList: " + arrayStr);

        int indexMax = 0;
        Integer max = array.get(indexMax);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
                indexMax = i;
            }
        }

        System.out.printf("The largest value is %d, which is in slot %d\n", max, indexMax);
    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}

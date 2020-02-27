package Week2.Arrays;

public class BasicArrays2 {
    // Slot 0 contains a 45
    private final static int ARRAY_LENGTH = 10;
    public static final int LIMIT_RANDOM = 100;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = generateRandom();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Slot %d contains a %d\n", i, array[i]);
        }
    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}

package Week2.Arrays;

public class LocatingTheLargestValue {

    private final static int ARRAY_LENGTH = 10;
    public static final int LIMIT_RANDOM = 100;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = generateRandom();
        }

        int max = array[0];
        int indexLargestValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexLargestValue = i;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.printf("The largest value is %d\n", max);
        System.out.printf("It is in slot %d\n", indexLargestValue);
    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}



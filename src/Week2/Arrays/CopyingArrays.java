package Week2.Arrays;

public class CopyingArrays {

    private final static int ARRAY_LENGTH = 10;
    public static final int LIMIT_RANDOM = 100;
    public static final int DEFAULT_INT = -7;

    public static void main(String[] args) {
        int[] arr1 = new int[ARRAY_LENGTH];
        int[] arr2 = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr1[i] = generateRandom();
        }

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr2[i] = arr1[i];
        }

        arr1[arr1.length - 1] = DEFAULT_INT;

        System.out.print("Array1: ");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("Array2: ");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }

    private static int generateRandom() {
        return Double.valueOf(Math.random() * LIMIT_RANDOM).intValue() + 1;
    }
}

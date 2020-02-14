package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");
        int sum = 0;
        while (true) {
            System.out.print("Number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            System.out.printf("The total so far is %d\n", sum);
        }
        System.out.printf("\n\nThe total is %d\n", sum);

    }
}

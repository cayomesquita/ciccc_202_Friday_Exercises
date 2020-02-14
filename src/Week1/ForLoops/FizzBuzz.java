package Week1.ForLoops;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            boolean multiple3 = i % 3 == 0;
            boolean multiple5 = i % 5 == 0;

            if (multiple3 || multiple5) {
                if (multiple3) {
                    System.out.print("Fizz");
                }
                if (multiple5) {
                    System.out.print("Buzz");
                }
            } else {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}

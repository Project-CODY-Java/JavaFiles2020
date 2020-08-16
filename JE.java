import java.util.Random;
import java.util.Scanner;

public class JE {
    public JE() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(99) + 1;

        while(true) {
            System.out.println("Enter a Number");
            int guess = scanner.nextInt();
            if (guess == num) {
                System.out.println("You are correct!");
                return;
            }

            if (guess < num) {
                System.out.println("Guess a Higher Number");
            } else if (guess > num) {
                System.out.println("Guess a Lower Number");
            }
        }
    }
}

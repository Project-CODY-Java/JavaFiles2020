//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(rockpaperscissor(input));
    }

    public static String rockpaperscissor(String input) {
        int num = -1;
        if (input.equals("rock")) {
            num = 0;
        }

        if (input.equals("paper")) {
            num = 1;
        }

        if (input.equals("scissors")) {
            num = 2;
        }

        if (input.equals("")) {
            num = 3;
        }

        Random random = new Random();
        int comNum = random.nextInt(3);
        String comVal = "";
        if (comNum == 0) {
            comVal = "rock";
        }

        if (comNum == 1) {
            comVal = "paper";
        }

        if (comNum == 2) {
            comVal = "scissors";
        }

        if ((comNum - num + 3) % 3 == 2) {
            return "You WON! Computer chose " + comVal;
        } else if ((comNum - num + 3) % 3 == 0) {
            return "You TIED! Computer chose " + comVal;
        } else {
            return (comNum - num + 3) % 3 == 1 ? "You LOST! :( Computer chose " + comVal : null;
        }
    }
}

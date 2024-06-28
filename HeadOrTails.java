import java.util.Random;
import java.util.Scanner;

public class HeadOrTails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        String coinToss[] = {"Heads", "Tails"};

        System.out.println("Who are you?");
        String name = sc.next();
        System.out.println("Hello, " + name);

        System.out.println("Tossing a coin...");

        Random r = new Random();

        for(int i = 1; i < 4; i++) {
            String value = coinToss[r.nextInt(2)];

            System.out.println("Round " + i + ": " + value);

            if (value == "Heads") {
                ++headsCount;
            } else {
                ++tailsCount;
            }
        }
        System.out.println("Heads: " + headsCount + ",Tails: " + tailsCount);
    }
}
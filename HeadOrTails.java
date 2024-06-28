import java.util.Random;

public class HeadOrTails {
    public static void main(String[] args) {
        int headsCount = 0;
        int tailsCount = 0;
        String coinToss[] = {"Heads", "Tails"};

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

        if (headsCount > tailsCount) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
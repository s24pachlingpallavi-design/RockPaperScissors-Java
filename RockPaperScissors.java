import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("Enter your choice: 0 = Rock, 1 = Paper, 2 = Scissors");

        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice! Please choose 0, 1, or 2.");
            return;
        }

         int computerChoice = random.nextInt(3);

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Game logic
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if (
                (userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}

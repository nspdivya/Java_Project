import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = { "", "Rock", "Paper", "Scissors" };

        int userScore = 0;
        int computerScore = 0;

        while (true) {

            System.out.println("\n--- Rock Paper Scissors Game ---");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            if (userChoice == 0) {
                System.out.println("Game Over!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int computerChoice = rand.nextInt(3) + 1;

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a Draw!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {

                System.out.println("You Win!");
                userScore++;
            } else {
                System.out.println("Computer Wins!");
                computerScore++;
            }

            System.out.println("Score -> You: " + userScore + " | Computer: " + computerScore);
        }

        sc.close();
    }
}
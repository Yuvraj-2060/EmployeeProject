import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();  // Random Number
        int mysteriousNumber = random.nextInt(100) + 1;
        int guess;
        boolean guessedCorrect = false;
        Scanner scanner = new Scanner(System.in);
        while (!guessedCorrect) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess == mysteriousNumber) {
                    System.out.println("Congratulations! Buddy You Guessed It!");
                    guessedCorrect = true;
                }
                else {
                    int difference = Math.abs(guess - mysteriousNumber);// Hint for the player. If he is close.
                    if (difference <= 10) {
                        System.out.println("You're Getting Close Buddy!");
                    } else {
                        System.out.println("You're Far Away Dude!");
                    }
                }
            }
            else {
                System.out.println("Error: Please enter a valid integer.");//
                scanner.next();
            }
        }
    }
}

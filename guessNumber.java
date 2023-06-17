import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int goal = random.nextInt(100) + 1; 
        int attempts = 0;
        boolean guesses = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("----------Welcome to Guess the Number game!----------");

        while (!guesses) {
            System.out.print("Make your guess between 1 to 100 : ");
            int guess = sc.nextInt();
            attempts++;

            if (guess < goal) {
                System.out.println("Think Higher!");
            } else if (guess > goal) {
                System.out.println("Go Down!");
            } else {
                System.out.println("\nCongratulations! You guesses the number in " + attempts + " attempts.\n");
                guesses = true;
            }
        }

        sc.close();
    }
}


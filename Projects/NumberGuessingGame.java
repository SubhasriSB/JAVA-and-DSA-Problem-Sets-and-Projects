import java.util.Scanner;

//Number Guessing Game with Unlimited attempts and score tracking
public class NumberGuessingGame {
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Guessing Game with Unlimited attempts and score tracking!");
        // Generating random number between 1 and 100
        int num = 1 + (int)(100 * Math.random());
        //Track the number of attempts for the user
        int attempts = 0;
        //Maximum number of attempts per round for the user
        int k = 5;
        boolean guessedCorrectly = false;
        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + k + " attempts to guess the number correctly!");
        System.out.println("All the Best! Let's Get Started !");
        //
        while(!guessedCorrectly){
            //Give the user k attempts to guess the number
            for(int i=0; i < k; i++ ) {
                System.out.println("Enter you Guess: ");
                int guess = sc.nextInt();
                attempts++; //Increment attempts count

                if (guess == num) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (guess < num) {
                    System.out.println("Number is greater than " + guess);
                } else {
                    System.out.println("Number is less than " + guess);
                }
            }
            if(!guessedCorrectly) {
                //Ask the user if they want to continue to guess the number after exhausting the attempt
                System.out.println("You have used all " + attempts + " attempts.");
                System.out.println("Do you want to continue?(Yes/No): ");
                String response = sc.next();
                //
                if (!response.equalsIgnoreCase("Yes")) {
                    System.out.println("Game Over! The correct answer is " + num);
                    break;
                }

            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        guessingNumberGame();
    }

}

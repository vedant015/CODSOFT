import java.util.*;
public class GuessTheNum {
    private Random RandomNum;

    public GuessTheNum(){
        this.RandomNum = new Random();
    }

    public void play(){
        int score = 0;
        int rounds = 0;
        boolean playing = true;

        while(playing){
            Scanner scanner = new Scanner(System.in);
            int GuessNum = RandomNum.nextInt(101);
            int attempts = 0;

            System.out.println("Welcome to the game: \nI am taking any number between 1 to 100 you have to guess it. \nYou have a maximum of 5 attempts. \nIf you guess correct you will get an extra attempt.");

            while (attempts < 5){
                System.out.print("Enter your guess: ");
                int Guess = scanner.nextInt();
                attempts++;

                if( Guess == GuessNum){
                    System.out.println("Congratulations! You guessed the correct number");
                    attempts= attempts-1;
                } else if (Guess < GuessNum) {
                    System.out.println("Too Low! Try Again");
                } else if (Guess > GuessNum ) {
                    System.out.println("Too High! Try agian");
                }
            }
            if (attempts == 5){
                System.out.println("Sorry! You could not guess the number: "+GuessNum );
            }
            System.out.print("Do you want to play again (y/n): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("n")){
                break;
            } else if (playAgain.equalsIgnoreCase("y")) {
                attempts=0;
            }

        }
        System.out.println("Thank you! Hope you enjoyed the game.");
    }

    public static void main(String[] args) {
        GuessTheNum GuessGame = new GuessTheNum();
        GuessGame.play();
    }
}

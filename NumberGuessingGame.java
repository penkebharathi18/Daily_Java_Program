import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        int guess;

        System.out.println("Guess a number between 1 to 10");

        guess = sc.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct Guess!");
        } else {
            System.out.println("Wrong Guess!");
        }

        sc.close();
    }
}
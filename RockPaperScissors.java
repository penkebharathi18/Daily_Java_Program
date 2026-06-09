import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        int computer = (int)(Math.random() * 3) + 1;

        System.out.println("Computer choice: " + computer);

        if(user == computer)
            System.out.println("Draw");
        else if((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2))
            System.out.println("You Win");
        else
            System.out.println("Computer Wins");

        sc.close();
    }
}
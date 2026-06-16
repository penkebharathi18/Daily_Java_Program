import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose:");
        System.out.println("1. Heads");
        System.out.println("2. Tails");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int toss = (int)(Math.random() * 2) + 1;

        System.out.println();

        if (toss == 1) {
            System.out.println("Coin Result: Heads");
        } else {
            System.out.println("Coin Result: Tails");
        }

        if (choice == toss) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }

        sc.close();
    }
}
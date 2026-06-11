import java.util.Scanner;

public class LuckyNumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int luckyNumber = (int)(Math.random() * 10) + 1;

        System.out.print("Choose a number (1-10): ");
        int userNumber = sc.nextInt();

        if(userNumber == luckyNumber) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost!");
            System.out.println("Lucky Number was: " + luckyNumber);
        }

        sc.close();
    }
}
import java.util.Scanner;

class CountEvenOddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        System.out.println("Even Digits: " + evenCount);
        System.out.println("Odd Digits: " + oddCount);

        sc.close();
    }
}
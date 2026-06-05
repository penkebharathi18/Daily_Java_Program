import java.util.Scanner;

class CountNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Enter 5 numbers: ");

        for(int i = 1; i <= 5; i++) {

            int num = sc.nextInt();

            if(num > 0) {
                positive++;
            }
            else if(num < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zero Numbers: " + zero);

        sc.close();
    }
}
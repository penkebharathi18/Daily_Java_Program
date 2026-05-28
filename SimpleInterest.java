import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        float rate = sc.nextFloat();

        System.out.print("Enter Time: ");
        float time = sc.nextFloat();

        float si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}
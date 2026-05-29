import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = units * 5.5;

        System.out.println("Electricity Bill = ₹" + bill);

        sc.close();
    }
}
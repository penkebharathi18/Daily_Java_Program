import java.util.Scanner;

class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";

        System.out.print("Enter Password: ");
        String userPassword = sc.nextLine();

        if (userPassword.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Wrong Password");
        }

        sc.close();
    }
}
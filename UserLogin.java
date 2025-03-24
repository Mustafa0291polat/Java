
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String username, password;

        System.out.print("Enter your username: ");
        username = scn.nextLine();

        System.out.print("Enter your password: ");
        password = scn.nextLine();

        if (username.equals("java") && password.equals("123")) {
            System.out.println("Successfully logged in");
        } else {
            System.out.println("Invalid login");
        }
    }
}
